package enunciate.defect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DefectApplication {

  public static void main(String[] args) {
    SpringApplication.run(DefectApplication.class, args);
  }

  @RestController
  public static class AController {

    @GetMapping(
      produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<MyPojo> doSomething() {
      return ResponseEntity.ok(new MyPojo());
    }
  }

}
