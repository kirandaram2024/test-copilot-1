package com.csx.crew.deadhead.domain;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

public class DeadheadRequest implements Serializable {

  private static final long serialVersionUID = -5235803480483584541L;

  private String alternateEmployeeId;
  private String seperateServiceNumberId;
  private String originMilepostId;
  private String destinationMilepostId;
  private String poolId;
  private String modeOfTransportationCode;
  private String taxiDateTime;
  private String taxiPickupCode;
  private String taxiDropoffCode;
  private String taxiReasonCode;
  private String taxiPartialCrewCode;
  private String taxiInstructions;
  private String crewSpecialInstructions;
  private String deadheadType;
  private String deadheadFrontendOrBackend;
  private String trainId;
  private String district;
  private String subDistrict;
  private LocalDateTime rtaoOriginalCrewRequestDateTime;
  private String noteType;
  private String trainFinalStationMilepostId;
  private String trainTurnStationMilepostId;

  private Date crewCallDateTime;
  private String engineerId;
  private String deadheadAuthorizationId;
  private String taxiAuthorizationId;
  private Date onDutyDateTime;
  private String amtrakTrainId;
  private String crewProfileId;
  private Long deadheadDurationHH;
  private Long deadheadDurationMM;
  private String authorizedById;
  private String fullName;
  private String trainOriginMilepostId;
  private String trainDestinationMilepostId;
  private String statusCode;

  private String destinationLocationType;
  private String originLocationType;
  private String createUserId;
  private String conductorId;
  private Date createTimestamp;
  private boolean dateSet;
  private String employeeInstructions;
  private Date lastUpdateTimestamp;
  private String lastUpdateUserId;
  private Date onDutyDate;
  private String vendorInstructions;
  private Date trainOrderDateTime;
  private boolean timeSet;
  private Long requestId;
  private Date originalOnDutyDateTime;



  public String getAlternateEmployeeId() {
    return alternateEmployeeId;
  }

  public void setAlternateEmployeeId(String alternateEmployeeId) {
    this.alternateEmployeeId = alternateEmployeeId;
  }

  public String getSeperateServiceNumberId() {
    return seperateServiceNumberId;
  }

  public void setSeperateServiceNumberId(String seperateServiceNumberId) {
    this.seperateServiceNumberId = seperateServiceNumberId;
  }

  public String getOriginMilepostId() {
    return originMilepostId;
  }

  public void setOriginMilepostId(String originMilepostId) {
    this.originMilepostId = originMilepostId;
  }

  public String getDestinationMilepostId() {
    return destinationMilepostId;
  }

  public void setDestinationMilepostId(String destinationMilepostId) {
    this.destinationMilepostId = destinationMilepostId;
  }

  public String getPoolId() {
    return poolId;
  }

  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  public String getModeOfTransportationCode() {
    return modeOfTransportationCode;
  }

  public void setModeOfTransportationCode(String modeOfTransportationCode) {
    this.modeOfTransportationCode = modeOfTransportationCode;
  }

  public String getTaxiDateTime() {
    return taxiDateTime;
  }

  public void setTaxiDateTime(String taxiDateTime) {
    this.taxiDateTime = taxiDateTime;
  }

  public String getTaxiPickupCode() {
    return taxiPickupCode;
  }

  public void setTaxiPickupCode(String taxiPickupCode) {
    this.taxiPickupCode = taxiPickupCode;
  }

  public String getTaxiDropoffCode() {
    return taxiDropoffCode;
  }

  public void setTaxiDropoffCode(String taxiDropoffCode) {
    this.taxiDropoffCode = taxiDropoffCode;
  }

  public String getTaxiReasonCode() {
    return taxiReasonCode;
  }

  public void setTaxiReasonCode(String taxiReasonCode) {
    this.taxiReasonCode = taxiReasonCode;
  }

  public String getTaxiPartialCrewCode() {
    return taxiPartialCrewCode;
  }

  public void setTaxiPartialCrewCode(String taxiPartialCrewCode) {
    this.taxiPartialCrewCode = taxiPartialCrewCode;
  }

  public String getTaxiInstructions() {
    return taxiInstructions;
  }

  public void setTaxiInstructions(String taxiInstructions) {
    this.taxiInstructions = taxiInstructions;
  }

  public String getCrewSpecialInstructions() {
    return crewSpecialInstructions;
  }

  public void setCrewSpecialInstructions(String crewSpecialInstructions) {
    this.crewSpecialInstructions = crewSpecialInstructions;
  }

  public String getDeadheadType() {
    return deadheadType;
  }

  public void setDeadheadType(String deadheadType) {
    this.deadheadType = deadheadType;
  }

  public String getDeadheadFrontendOrBackend() {
    return deadheadFrontendOrBackend;
  }

  public void setDeadheadFrontendOrBackend(String deadheadFrontendOrBackend) {
    this.deadheadFrontendOrBackend = deadheadFrontendOrBackend;
  }

  public String getTrainId() {
    return trainId;
  }

  public void setTrainId(String trainId) {
    this.trainId = trainId;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getSubDistrict() {
    return subDistrict;
  }

  public void setSubDistrict(String subDistrict) {
    this.subDistrict = subDistrict;
  }

  public LocalDateTime getRtaoOriginalCrewRequestDateTime() {
    return rtaoOriginalCrewRequestDateTime;
  }

  public void setRtaoOriginalCrewRequestDateTime(LocalDateTime rtaoOriginalCrewRequestDateTime) {
    this.rtaoOriginalCrewRequestDateTime = rtaoOriginalCrewRequestDateTime;
  }

  public String getNoteType() {
    return noteType;
  }

  public void setNoteType(String noteType) {
    this.noteType = noteType;
  }

  public String getTrainFinalStationMilepostId() {
    return trainFinalStationMilepostId;
  }

  public void setTrainFinalStationMilepostId(String trainFinalStationMilepostId) {
    this.trainFinalStationMilepostId = trainFinalStationMilepostId;
  }

  public String getTrainTurnStationMilepostId() {
    return trainTurnStationMilepostId;
  }

  public void setTrainTurnStationMilepostId(String trainTurnStationMilepostId) {
    this.trainTurnStationMilepostId = trainTurnStationMilepostId;
  }

  public String getEngineerId() {
    return engineerId;
  }

  public void setEngineerId(String engineerId) {
    this.engineerId = engineerId;
  }

  public String getDeadheadAuthorizationId() {
    return deadheadAuthorizationId;
  }

  public void setDeadheadAuthorizationId(String deadheadAuthorizationId) {
    this.deadheadAuthorizationId = deadheadAuthorizationId;
  }

  public String getTaxiAuthorizationId() {
    return taxiAuthorizationId;
  }

  public void setTaxiAuthorizationId(String taxiAuthorizationId) {
    this.taxiAuthorizationId = taxiAuthorizationId;
  }

  public String getAmtrakTrainId() {
    return amtrakTrainId;
  }

  public void setAmtrakTrainId(String amtrakTrainId) {
    this.amtrakTrainId = amtrakTrainId;
  }

  public String getCrewProfileId() {
    return crewProfileId;
  }

  public void setCrewProfileId(String crewProfileId) {
    this.crewProfileId = crewProfileId;
  }

  public Long getDeadheadDurationHH() {
    return deadheadDurationHH;
  }

  public void setDeadheadDurationHH(Long deadheadDurationHH) {
    this.deadheadDurationHH = deadheadDurationHH;
  }

  public Long getDeadheadDurationMM() {
    return deadheadDurationMM;
  }

  public void setDeadheadDurationMM(Long deadheadDurationMM) {
    this.deadheadDurationMM = deadheadDurationMM;
  }

  public String getAuthorizedById() {
    return authorizedById;
  }

  public void setAuthorizedById(String authorizedById) {
    this.authorizedById = authorizedById;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getTrainOriginMilepostId() {
    return trainOriginMilepostId;
  }

  public void setTrainOriginMilepostId(String trainOriginMilepostId) {
    this.trainOriginMilepostId = trainOriginMilepostId;
  }

  public String getTrainDestinationMilepostId() {
    return trainDestinationMilepostId;
  }

  public void setTrainDestinationMilepostId(String trainDestinationMilepostId) {
    this.trainDestinationMilepostId = trainDestinationMilepostId;
  }

  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public String getDestinationLocationType() {
    return destinationLocationType;
  }

  public void setDestinationLocationType(String destinationLocationType) {
    this.destinationLocationType = destinationLocationType;
  }

  public String getOriginLocationType() {
    return originLocationType;
  }

  public void setOriginLocationType(String originLocationType) {
    this.originLocationType = originLocationType;
  }

  public String getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public String getConductorId() {
    return conductorId;
  }

  public void setConductorId(String conductorId) {
    this.conductorId = conductorId;
  }



  public String getEmployeeInstructions() {
    return employeeInstructions;
  }

  public void setEmployeeInstructions(String employeeInstructions) {
    this.employeeInstructions = employeeInstructions;
  }

  public String getLastUpdateUserId() {
    return lastUpdateUserId;
  }

  public void setLastUpdateUserId(String lastUpdateUserId) {
    this.lastUpdateUserId = lastUpdateUserId;
  }

  public Date getCrewCallDateTime() {
    return crewCallDateTime;
  }

  public void setCrewCallDateTime(Date crewCallDateTime) {
    this.crewCallDateTime = crewCallDateTime;
  }

  public Date getOnDutyDateTime() {
    return onDutyDateTime;
  }

  public void setOnDutyDateTime(Date onDutyDateTime) {
    this.onDutyDateTime = onDutyDateTime;
  }

  public Date getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Date createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public boolean isDateSet() {
    return dateSet;
  }

  public void setDateSet(boolean dateSet) {
    this.dateSet = dateSet;
  }

  public Date getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
  }

  public Date getOnDutyDate() {
    return onDutyDate;
  }

  public void setOnDutyDate(Date onDutyDate) {
    this.onDutyDate = onDutyDate;
  }

  public String getVendorInstructions() {
    return vendorInstructions;
  }

  public void setVendorInstructions(String vendorInstructions) {
    this.vendorInstructions = vendorInstructions;
  }

  public Date getTrainOrderDateTime() {
    return trainOrderDateTime;
  }

  public void setTrainOrderDateTime(Date trainOrderDateTime) {
    this.trainOrderDateTime = trainOrderDateTime;
  }

  public boolean isTimeSet() {
    return timeSet;
  }

  public void setTimeSet(boolean timeSet) {
    this.timeSet = timeSet;
  }

  public Long getRequestId() {
    return requestId;
  }

  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }

  public Date getOriginalOnDutyDateTime() {
    return originalOnDutyDateTime;
  }

  public void setOriginalOnDutyDateTime(Date originalOnDutyDateTime) {
    this.originalOnDutyDateTime = originalOnDutyDateTime;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }


}
