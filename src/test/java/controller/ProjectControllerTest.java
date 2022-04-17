package controller;

import java.util.Date;
import java.util.List;
import model.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adriel
 */
class ProjectControllerTest {

    @Test
    void projectIsSavedOnDatabase() {
        ProjectController projectController = new ProjectController();
        
        // Busca os projetos salvos no banco
        List<Project> projetos = projectController.getAll();
        int tamanho = projetos.size();
        
        // Cria novo projeto
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Projeto para testar funcionamento da aplicacao");
        project.setUpdatedAt(new Date());
        
        // Salva projeto no banco
        projectController.save(project);
        
        // Atualiza lista de projetos
        projetos = projectController.getAll();
        
        // Verifica de projeto foi salvo
        assertEquals(projetos.size(), tamanho+1, "Um novo projeto foi adicionado");
        
        // Remove projeto de teste criado
        projectController.removeById(projetos.get(tamanho).getId());
    }
    
    @Test
    void projectIsUpdated() {
        ProjectController projectController = new ProjectController();
        
        // Cria um projeto
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Projeto para testar funcionamento da aplicacao");
        project.setUpdatedAt(new Date());
        projectController.save(project);
        
        // Busca os projetos salvos no banco
        List<Project> projetos = projectController.getAll();
        int tamanho = projetos.size();
        
        // Carrega variavel projeto com dados do banco
        project = projetos.get(tamanho-1);
        String nomeAntigo = project.getName();
        
        // Atualiza nome e hora de update do projeto
        project.setName("Projeto teste 2");
        project.setUpdatedAt(new Date());
        projectController.update(project);
        
        // Atualiza dados dos projetos
        projetos = projectController.getAll();
        
        // Verifica se atualização ocorreu
        assertEquals(projetos.size(), tamanho, "Há a mesma quantidade de projetos");
        assertNotEquals(nomeAntigo, projetos.get(tamanho-1).getName(), "O nome do projeto mudou");
        
        // Remove projeto de teste do banco
        projectController.removeById(project.getId());
    }
    
    @Test
    void projectIsRemoved() {
        ProjectController projectController = new ProjectController();
        
        // Cria um projeto
        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Projeto para testar funcionamento da aplicacao");
        project.setUpdatedAt(new Date());
        projectController.save(project);
        
        // Busca projetos salvos no banco
        List<Project> projetos = projectController.getAll();
        int tamanho = projetos.size();
        
        // Exclui o projeto do banco
        project = projetos.get(tamanho-1);
        projectController.removeById(project.getId());
        
        // Atualiza registro de projetos
        projetos = projectController.getAll();
        
        // Verifica se exclusao foi feita
        assertEquals(projetos.size(), tamanho-1, "Há um projeto a menos");
    }
}
