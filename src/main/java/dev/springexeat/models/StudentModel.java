package dev.springexeat.models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "students")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String matNo;
    private String guardianFullName;
    private String guardianPhoneNumber;
    private String guardianAddress;
    private String destination;
    private LocalDate leaveDate;
    private LocalTime leaveTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private String reasonForLeaving;
    private boolean status;

    public StudentModel() {
    }

    public StudentModel(Long id, String matNo, String guardianFullName, String guardianPhoneNumber, String guardianAddress, String destination, LocalDate leaveDate, LocalTime leaveTime, LocalDate returnDate, LocalTime returnTime, String reasonForLeaving, boolean status, Date created_at, Date updated_at) {
        this.id = id;
        this.matNo = matNo;
        this.guardianFullName = guardianFullName;
        this.guardianPhoneNumber = guardianPhoneNumber;
        this.guardianAddress = guardianAddress;
        this.destination = destination;
        this.leaveDate = leaveDate;
        this.leaveTime = leaveTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.reasonForLeaving = reasonForLeaving;
        this.status = status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatNo() {
        return matNo;
    }

    public void setMatNo(String matNo) {
        this.matNo = matNo;
    }

    public String getGuardianFullName() {
        return guardianFullName;
    }

    public void setGuardianFullName(String guardianFullName) {
        this.guardianFullName = guardianFullName;
    }

    public String getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public void setGuardianPhoneNumber(String guardianPhoneNumber) {
        this.guardianPhoneNumber = guardianPhoneNumber;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
    }

    public LocalTime getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(LocalTime leaveTime) {
        this.leaveTime = leaveTime;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalTime returnTime) {
        this.returnTime = returnTime;
    }

    public String getReasonForLeaving() {
        return reasonForLeaving;
    }

    public void setReasonForLeaving(String reasonForLeaving) {
        this.reasonForLeaving = reasonForLeaving;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @CreationTimestamp
    Date created_at;

    @UpdateTimestamp
    Date updated_at;


}
