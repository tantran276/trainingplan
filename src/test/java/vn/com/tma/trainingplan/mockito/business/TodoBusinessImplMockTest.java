package vn.com.tma.trainingplan.mockito.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import vn.com.tma.trainingplan.mockito.data.api.TodoService;

public class TodoBusinessImplMockTest {

	@Ignore
	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring"
				, "Learn To Dance");
		when(todoServiceMock.retrieveTodos("Tan")).thenReturn(todos); 
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(
				todoServiceMock);
		
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Tan");
		assertEquals(2, filteredTodos.size());
	}
	
	@Ignore
	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock2() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring"
				, "Learn To Dance");
		when(todoServiceMock.retrieveTodos("Tan")).thenReturn(todos); 
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(
				todoServiceMock);
		
		List<String> filteredTodos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("");
		assertEquals(0, filteredTodos.size());
	}
	
	@Test
	public void letMockListGet() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("Number");
		assertEquals("Number", listMock.get(3));
		assertEquals("Number", listMock.get(4));
	}
	
	@Test(expected = RuntimeException.class)
	public void letMockListGet_throwException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(
				new RuntimeException("Some thing"));
		listMock.get(0);
	}
}
