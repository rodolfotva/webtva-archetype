package ${package};

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ${project-name} {

  private static final Logger logger = LogManager.getLogger(${project-name}.class.getName());

  
  public static void ${project-name}SampleMethod() {
    logger.info("Sample method generated by maven archetype");
    System.out.println("Sample method generated by maven archetype");
  }
}
