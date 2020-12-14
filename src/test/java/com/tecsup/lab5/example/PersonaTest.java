/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.lab5.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jcarpio
 */
public class PersonaTest {
    
    public PersonaTest() {
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        Persona nuevo = new Persona("Jorge");
        assertEquals("Jorge",nuevo.getNombre());
    }
    
}
