package com.example.demo.rebelcontrollertest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.bootstrap.BootStrapData;
import com.example.demo.controllers.RebelController;


@RunWith(SpringJUnit4ClassRunner.class)
public class rebelControllerTest {
	
	private MockMvc mockMvc;
	
	@InjectMocks 
	private RebelController rebelController;
	
	@Before
	public void setUp() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(rebelController).build();
	}
	@Test
	public void testRebelController() throws Exception{
		
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/rebels"))
						.andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void testRebellControllerId() throws Exception {
	
			mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/rebels/1")
					.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk());
	
			
			//e.printStackTrace();
		
	}
}
