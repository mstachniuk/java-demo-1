package devoxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NullPointerDereference {

  private static final Logger LOG = LoggerFactory
      .getLogger(NullPointerDereference.class);

  public int searchForAnimalID(String animal) {
    if (animal == null) {
      LOG.warn("animal should not be null");
    }
    String trimmedAnimal = trim(animal);
    if ("Antonio".equals(trimmedAnimal)) {
      return 1;
    }
    return -1;
  }

  private String trim(String animal) {
    return animal.trim();
  }
}