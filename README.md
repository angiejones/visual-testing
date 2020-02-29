# Visual Testing with Applitools

**Prereqs:**
* Install Java 8 or later.
* Create your [free Applitools account](https://applitools.com/users/register), get the API key, and add it to `bookstore/resources/test.properties`
* In `bookstore/resources/test.properties`, change `app.url` to your local path for the `website/index.html` file from this repo. Alternatively, you can point it to `https://automationbookstore.dev`

The tests are within `bookstore/src/test/java/tests/SearchTests.java`. The original functional tests are commented out. The tests are reimplemented using visual testing.

To run the tests, right click on a test's name and choose Run.
