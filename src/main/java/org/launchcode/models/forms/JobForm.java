package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;

    private Location location;
    private CoreCompetency coreCompetency;
    private PositionType positionType;

    @NotNull
    private int employerId;

    /*
        TODO #3 - Included other fields needed to create a job,
        with correct validation attributes and display names.
        Don't forget to add getters and setters
     */

    private ArrayList<Employer> employers;
    private ArrayList<Location> locations;
    private ArrayList<CoreCompetency> coreCompetencies;
    private ArrayList<PositionType> positionTypes;

    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*
            TODO #4 - populate the other ArrayList collections needed in the view
        */
        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        coreCompetencies = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();

    }

    public String getName() {
        return name;
    }
    public int getEmployerId() {
        return employerId;
    }
    public Location getLocation() {
        return location;
    }
    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public PositionType getPositionType() {
        return positionType;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }
    public ArrayList<Location> getLocations() {
        return locations;
    }
    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }
    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public void setCoreCompetency(CoreCompetency coreCompetence) {
        this.coreCompetency = coreCompetence;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }
    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }
    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}
