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
        Job job = new Job("Software Developer", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));

        assertTrue(job instanceof Job);
        assertEquals("Software Developer", job.getName());
        assertEquals("Tech Corp", job.getEmployer().getValue());
        assertEquals("Saint Louis", job.getLocation().getValue());
        assertEquals("Full-time", job.getPositionType().getValue());
        assertEquals("Java", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Software Developer", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));
        Job job2 = new Job("Software Developer", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Software Developer", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected = job.toString();

        assertTrue(expected.startsWith(System.lineSeparator()));
        assertTrue(expected.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Software Developer", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: Software Developer" + System.lineSeparator() + "Employer: Tech Corp" + System.lineSeparator() + "Location: Saint Louis" + System.lineSeparator() + "Position Type: Full-time" + System.lineSeparator() + "Core Competency: Java" + System.lineSeparator();

        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("Tech Corp"), new Location("Saint Louis"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: Data not available" + System.lineSeparator() + "Employer: Tech Corp" + System.lineSeparator() + "Location: Saint Louis" + System.lineSeparator() + "Position Type: Full-time" + System.lineSeparator() + "Core Competency: Java" + System.lineSeparator();

        assertEquals(expected, job.toString());
    }
}
