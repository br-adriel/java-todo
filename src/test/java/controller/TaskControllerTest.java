package controller;

import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author adriel
 */
public class TaskControllerTest {

    @Test
    void taskIsSavedOnDatabase() {
        // Cria um projeto
        ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Projeto para testar funcionamento da aplicacao");
        project.setUpdatedAt(new Date());
        projectController.save(project);

        // Busca projeto salvo no banco
        List<Project> projetos = projectController.getAll();
        int tamanhoProj = projetos.size();
        project = projetos.get(tamanhoProj - 1);

        // Cria nova tarefa
        TaskController taskController = new TaskController();
        int tamanhoTar = taskController.getAll(project.getId()).size();

        Task task = new Task();
        task.setCreatedAt(new Date());
        task.setDeadline(new Date());
        task.setDescription("Tarefa de teste");
        task.setIdProject(project.getId());
        task.setIsCompleted(false);
        task.setName("Teste");
        task.setNotes("");
        task.setUpdatedAt(new Date());

        // Salva tarefa no banco
        taskController.save(task);

        // Verifica se tarefa foi salva
        assertEquals(taskController.getAll(project.getId()).size(),
                tamanhoTar + 1, "A tarefa foi salva no banco");

        // Atualiza tarefa com dados salvos
        task = taskController.getAll(project.getId()).get(tamanhoTar);

        // Exclui a tarefa e o projeto do banco
        taskController.removeById(task.getId());
        projectController.removeById(project.getId());
    }

    @Test
    void taskIsUpdated() {
        // Cria um projeto
        ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Projeto para testar funcionamento da aplicacao");
        project.setUpdatedAt(new Date());
        projectController.save(project);

        // Busca projeto salvo no banco
        List<Project> projetos = projectController.getAll();
        int tamanhoProj = projetos.size();
        project = projetos.get(tamanhoProj - 1);

        // Cria nova tarefa
        TaskController taskController = new TaskController();

        Task task = new Task();
        task.setCreatedAt(new Date());
        task.setDeadline(new Date());
        task.setDescription("Tarefa de teste");
        task.setIdProject(project.getId());
        task.setIsCompleted(false);
        task.setName("Teste");
        task.setNotes("");
        task.setUpdatedAt(new Date());

        // Salva tarefa no banco
        taskController.save(task);
        int tamanhoTar = taskController.getAll(project.getId()).size();

        // Atualiza tarefa com dados salvos
        task = taskController.getAll(project.getId()).get(tamanhoTar - 1);

        // Modifica dados da tarefa
        String nomeAntigo = task.getName();
        task.setName("Novo nome");

        // Salva modificacoes no banco de dados
        taskController.update(task);
        task = taskController.getAll(project.getId()).get(tamanhoTar - 1);

        // Verifica se tarefa foi atualizada
        assertEquals(taskController.getAll(project.getId()).size(), tamanhoTar,
                "O número de tarefas salvas no banco é o mesmo");
        assertNotEquals(nomeAntigo, task.getName(), "A tarefa foi atualizada");

        // Exclui a tarefa e o projeto do banco
        taskController.removeById(task.getId());
        projectController.removeById(project.getId());
    }

    @Test
    void taskIsDeleted() {
        // Cria um projeto
        ProjectController projectController = new ProjectController();

        Project project = new Project();
        project.setName("Projeto teste");
        project.setDescription("Projeto para testar funcionamento da aplicacao");
        project.setUpdatedAt(new Date());
        projectController.save(project);

        // Busca projeto salvo no banco
        List<Project> projetos = projectController.getAll();
        int tamanhoProj = projetos.size();
        project = projetos.get(tamanhoProj - 1);

        // Cria nova tarefa
        TaskController taskController = new TaskController();

        Task task = new Task();
        task.setCreatedAt(new Date());
        task.setDeadline(new Date());
        task.setDescription("Tarefa de teste");
        task.setIdProject(project.getId());
        task.setIsCompleted(false);
        task.setName("Teste");
        task.setNotes("");
        task.setUpdatedAt(new Date());

        // Salva tarefa no banco
        taskController.save(task);
        int tamanhoTar = taskController.getAll(project.getId()).size();
        task = taskController.getAll(project.getId()).get(tamanhoTar - 1);

        // Exclui a tarefa e o projeto
        taskController.removeById(task.getId());
        projectController.removeById(project.getId());

        // Verifica exclusao da tarefa
        assertEquals(taskController.getAll(project.getId()).size(),
                tamanhoTar - 1, "A tarefa foi excluida");
    }
}
