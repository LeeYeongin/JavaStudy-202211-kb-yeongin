package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * serialize (Object -> Json)
 * deserialize (Json -> object)
 */

@Builder
@Data
public class User { // 모두 serialize 해줌
	@Expose(serialize = true, deserialize = true)
	private String username;
	@Expose(serialize = false, deserialize = false)
	private String password;
	@Expose(serialize = true,  deserialize = false)
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;
}
