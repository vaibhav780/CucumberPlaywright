Feature: Login
  Scenario Outline: Login and logout to application verifiy Home Page
    Given user launched application
    When user verify Login Page title "Login"
    When user logged in with username "<UserName>" and "<Password>"
    When user verify Home Page title "<pagetitle>"
    Then user logout from application
    When user verify Login Page title "Login"

    Examples:
      | UserName | Password | pagetitle |
      | admin    | admin123 | Dashboard |

  Scenario Outline: Verify Admin Section
    Given user launched application
    When user verify Login Page title "Login"
    When user logged in with username "<UserName>" and "<Password>"
    When user verify Home Page title "<pagetitle>"
    When user click on Admin section
    When user click on add button
    Examples:
      | UserName | Password | pagetitle |
      | admin    | admin123 | Dashboard |