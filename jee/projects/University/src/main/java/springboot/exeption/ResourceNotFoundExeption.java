package springboot.exeption;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundExeption {
	public static final long seriaLVersionUID=1L;
	public ResourceNotFoundExeption(String message) {
		super();
	}

}
