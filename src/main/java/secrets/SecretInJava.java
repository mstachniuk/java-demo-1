package devoxx;

import java.util.Properties;

public class SecretInJava {
  public static void main(String[] args) {
    Properties props = new Properties();
    props.put("token", "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");
    
    // S8135
    props.set("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoicm9vdCIsImZsYWciOiJoZWxsbyB3b3JsZCJ9.Fj8Y7ZGSLtNMyAkqGKWddRg3ZvwOpOTvRK7rHl4RWt4")

    // S8136
    String a = "Authorization: Basic dXNlcm5hbWU6OGZLejJwUTltTHg0"

  }
}
