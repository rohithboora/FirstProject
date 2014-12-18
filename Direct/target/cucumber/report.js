$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cos/TescoDirect.feature");
formatter.feature({
  "line": 1,
  "name": "To do online Shopping",
  "description": "\r\nAs a User\r\nI want to login\r\nSo I can do shopping",
  "id": "to-do-online-shopping",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8779902218,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User can Login",
  "description": "",
  "id": "to-do-online-shopping;user-can-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User is on Tesco Direct Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User tries to login with Username \"rohithboora@gmail.com\" and Password \"1234567890\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User can see the profile page with sign out option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepD.user_is_on_Tesco_Direct_Home_Page()"
});
formatter.result({
  "duration": 114682495,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rohithboora@gmail.com",
      "offset": 35
    },
    {
      "val": "1234567890",
      "offset": 72
    }
  ],
  "location": "StepD.user_tries_to_login_with_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 1938346841,
  "status": "passed"
});
formatter.match({
  "location": "StepD.user_can_see_the_profile_page_with_sign_out_option()"
});
formatter.result({
  "duration": 25492,
  "status": "passed"
});
formatter.after({
  "duration": 481112887,
  "status": "passed"
});
});