package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Project manager", new Employer("Disney"), new Location("Orlando"), new PositionType("Quality assurance"), new CoreCompetency("Scrum"));

        assertTrue(job instanceof Job);
        assertEquals("Project manager", job.getName());
        assertEquals("Disney", job.getEmployer().getValue());
        assertEquals("Orlando", job.getLocation().getValue());
        assertEquals("Quality assurance", job.getPositionType().getValue());
        assertEquals("Scrum", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Software Developer", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));
        Job job2 = new Job("Software Developer", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));

        assertFalse(job1.equals(job2));
    }
}
