package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResortsListResorts
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-10-12T00:02:45.381412088Z[GMT]")


public class ResortsListResorts   {
  @JsonProperty("resortName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String resortName = null;

  @JsonProperty("resortID")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer resortID = null;


  public ResortsListResorts resortName(String resortName) { 

    this.resortName = resortName;
    return this;
  }

  /**
   * Get resortName
   * @return resortName
   **/
  
  @Schema(description = "")
  
  public String getResortName() {  
    return resortName;
  }



  public void setResortName(String resortName) { 
    this.resortName = resortName;
  }

  public ResortsListResorts resortID(Integer resortID) { 

    this.resortID = resortID;
    return this;
  }

  /**
   * Get resortID
   * @return resortID
   **/
  
  @Schema(description = "")
  
  public Integer getResortID() {  
    return resortID;
  }



  public void setResortID(Integer resortID) { 
    this.resortID = resortID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResortsListResorts resortsListResorts = (ResortsListResorts) o;
    return Objects.equals(this.resortName, resortsListResorts.resortName) &&
        Objects.equals(this.resortID, resortsListResorts.resortID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resortName, resortID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResortsListResorts {\n");
    
    sb.append("    resortName: ").append(toIndentedString(resortName)).append("\n");
    sb.append("    resortID: ").append(toIndentedString(resortID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
