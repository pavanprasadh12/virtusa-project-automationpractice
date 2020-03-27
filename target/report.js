$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/eclipse-workspace/VirtusaProject/src/test/resources/FeatureFile/tShirtOrderExe.feature");
formatter.feature({
  "name": "AutomationPractie Ordering Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Order T-Shirt (and Verify in Order History)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches browser and pass url",
  "keyword": "Given "
});
formatter.match({
  "location": "tShirtOrderExe.user_launches_browser_and_pass_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "When "
});
formatter.match({
  "location": "tShirtOrderExe.user_clicks_signIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "testing999@test.com",
        "password1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "tShirtOrderExe.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users clicks signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.users_clicks_signIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on tShirt button",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_clicks_on_tShirt_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on AddToCard button",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_clicks_on_AddToCard_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on ProceedToCheckOut button",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_clicks_on_ProceedToCheckOut_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user to check the order and clicks submit",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_to_check_the_order_and_clicks_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submit Address Confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_submit_Address_Confirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checks terms service and clicks submit",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_checks_terms_service_and_clicks_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks pay by check",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_clicks_pay_by_check()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on confirm my order",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.user_clicks_on_confirm_my_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies order in order history",
  "keyword": "Then "
});
formatter.match({
  "location": "tShirtOrderExe.user_verifies_order_in_order_history()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches browser and pass url",
  "keyword": "Given "
});
formatter.match({
  "location": "tShirtOrderExe.user_launches_browser_and_pass_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks signIn link",
  "keyword": "When "
});
formatter.match({
  "location": "tShirtOrderExe.user_clicks_signIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "testing999@test.com",
        "password1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "tShirtOrderExe.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "users clicks signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "tShirtOrderExe.users_clicks_signIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks my personal info button",
  "keyword": "And "
});
formatter.match({
  "location": "updateInfoExe.user_clicks_my_personal_info_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user updates FirstName and LastName",
  "rows": [
    {
      "cells": [
        "Pavan Prasadh",
        "R"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "updateInfoExe.user_updates_FirstName_and_LastName(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password",
  "rows": [
    {
      "cells": [
        "testing999@test.com",
        "password1"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "updateInfoExe.user_enters_valid_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "updateInfoExe.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the message",
  "keyword": "Then "
});
formatter.match({
  "location": "updateInfoExe.verify_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});