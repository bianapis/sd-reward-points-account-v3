package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQExpirationRetrieveInputModelExpirationInstanceAnalysis
 */
public class BQExpirationRetrieveInputModelExpirationInstanceAnalysis   {
  private String expirationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return expirationInstanceAnalysisReference
  **/

  public String getExpirationInstanceAnalysisReference() {
    return expirationInstanceAnalysisReference;
  }

  public void setExpirationInstanceAnalysisReference(String expirationInstanceAnalysisReference) {
    this.expirationInstanceAnalysisReference = expirationInstanceAnalysisReference;
  }


}

