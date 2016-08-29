package poc_fuse.fuse1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Microservicio1 {
	

	public Microservicio1() {
		super();
	}

	@RequestMapping(value = "/Microservicio1", method = RequestMethod.POST)
	public @ResponseBody String Microservicio1(@RequestBody String mensajeIn) {
		
		
		long iniTime = System.currentTimeMillis();
		
		
		
		System.out.println("FIN ServicioB.  ts = {" + (System.currentTimeMillis() - iniTime) + "}");
		
		return "<br><h1><strong>Microservicio 1 Client ==> GET STOCK </strong></h1></br>";
	}
	
	

	/*******************************************
	 * MAIN                                    *
	 *                                         *
	 * @param args                             *
	 *                                         *
	 * @throws Exception                       *
	 *                                         *
	 ******************************************/
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Microservicio1.class, args);
	}

}
