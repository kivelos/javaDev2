package dev.java.db.model;

import java.util.List;
import java.util.Objects;

public class Vacancy extends Entity {
    private long id;
    private String position;
    private float salaryInDollarsFrom;
    private float salaryInDollarsTo;
    private VacancyState vacancyState;
    private float experienceYearsRequire;
    private User developer;
    private List<Interview> interviews;
    private List<Candidate> passedCandidates;
    private List<Skill> skillRequirements;

    public Vacancy() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalaryInDollarsFrom() {
        return salaryInDollarsFrom;
    }

    public void setSalaryInDollarsFrom(float salaryInDollarsFrom) {
        this.salaryInDollarsFrom = salaryInDollarsFrom;
    }

    public float getSalaryInDollarsTo() {
        return salaryInDollarsTo;
    }

    public void setSalaryInDollarsTo(float salaryInDollarsTo) {
        this.salaryInDollarsTo = salaryInDollarsTo;
    }

    public VacancyState getVacancyState() {
        return vacancyState;
    }

    public void setVacancyState(VacancyState vacancyState) {
        this.vacancyState = vacancyState;
    }

    public float getExperienceYearsRequire() {
        return experienceYearsRequire;
    }

    public void setExperienceYearsRequire(float experienceYearsRequire) {
        this.experienceYearsRequire = experienceYearsRequire;
    }

    public User getDeveloper() {
        return developer;
    }

    public void setDeveloper(User developer) {
        this.developer = developer;
    }

    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    public List<Candidate> getPassedCandidates() {
        return passedCandidates;
    }

    public void setPassedCandidates(List<Candidate> passedCandidates) {
        this.passedCandidates = passedCandidates;
    }

    public List<Skill> getSkillRequirements() {
        return skillRequirements;
    }

    public void setSkillRequirements(List<Skill> skillRequirements) {
        this.skillRequirements = skillRequirements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacancy vacancy = (Vacancy) o;
        return id == vacancy.id &&
                Float.compare(vacancy.salaryInDollarsFrom, salaryInDollarsFrom) == 0 &&
                Float.compare(vacancy.salaryInDollarsTo, salaryInDollarsTo) == 0 &&
                Float.compare(vacancy.experienceYearsRequire, experienceYearsRequire) == 0 &&
                Objects.equals(position, vacancy.position) &&
                vacancyState == vacancy.vacancyState &&
                Objects.equals(developer, vacancy.developer) &&
                Objects.equals(interviews, vacancy.interviews) &&
                Objects.equals(passedCandidates, vacancy.passedCandidates) &&
                Objects.equals(skillRequirements, vacancy.skillRequirements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position, salaryInDollarsFrom, salaryInDollarsTo, vacancyState, experienceYearsRequire, developer, interviews, passedCandidates, skillRequirements);
    }
}
