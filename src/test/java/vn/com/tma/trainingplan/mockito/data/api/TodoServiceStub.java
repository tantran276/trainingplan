package vn.com.tma.trainingplan.mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

	@Override
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring"
				, "Learn To Dance");
	}

}
