/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Diego Luz
 */
public class PacienteDAOTest {
    
    public PacienteDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarPaciente method, of class PacienteDAO.
     */
   @Test
	public void testCadastrarPaciente() throws Exception {
		System.out.println("testCadastrarPaciente");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Paciente pac = new Paciente();
		pac.setNome("Diego");
		pac.setCpf("111.111.111-11");
		pac.setDataNascimento(sdf.parse("11/11/1111"));
		pac.setEndereco("Rua Teste");
		pac.setConvenio(2);
		pac.setTelefone("(11)11111-1111");

		PacienteDAO instance = new PacienteDAO();
		instance.cadastrarPaciente(pac);

	}

    
}
