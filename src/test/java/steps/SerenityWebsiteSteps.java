package steps;

import pages.SerenityWesitePage;

public class SerenityWebsiteSteps {
    private SerenityWesitePage serenityWesitePage;

    public void selectCourse(String listCourses) {
        String[] courses = listCourses.split("->");
        for (String course : courses) {
            serenityWesitePage.selectCourse(course);
        }
    }

    public boolean isCourseOpened(String course){
        return course.contains(serenityWesitePage.getCourseTitle());
    }
}
