// Things spring-boot do automagically are in comments
// The rest is all you need to start a web service with
// spring boot!

//@Grab("spring-boot-starter-web")

// import org.springframework.web.bind.annotation.RestController
// + a bunch of other imports ...

@RestController // @EnableAutoConfiguration
public class HelloWorld {

  @RequestMapping("/")
  public String home(){
    return "Hello World!";
  }

  // public static void main(String[] args){
  //  SpringApplication.run(HelloWorld.class, args);
  // }

}
