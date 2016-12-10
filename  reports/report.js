$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/cucumber/testcases/UAEHomepage.feature");
formatter.feature({
  "line": 1,
  "name": "Validate UAE Exchange home page",
  "description": "in order to apply to wheeler loan",
  "id": "validate-uae-exchange-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "verify UAE Exchange home page",
  "description": "",
  "id": "validate-uae-exchange-home-page;verify-uae-exchange-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to UAE Exchange Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I clicked on Pay Money and selected paymoney",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I create a payment",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I check all the details are validated",
  "rows": [
    {
      "cells": [
        "YourMobile",
        "AccountNo",
        "Amount",
        "BeneficiaryMobile",
        "IFSCCode"
      ],
      "line": 9
    },
    {
      "cells": [
        "777777777",
        "777777777",
        "3000",
        "77777777777",
        "HDFC0000485"
      ],
      "line": 10
    },
    {
      "cells": [
        "888888888",
        "888888888",
        "4000",
        "8888888888888",
        "HDFC0000485"
      ],
      "line": 11
    },
    {
      "cells": [
        "999999999",
        "99999999",
        "5000",
        "9999999999999",
        "HDFC0000485"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_UAE_Exchange_Landing_page()"
});
formatter.result({
  "duration": 19429955926,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_clicked_on_Pay_Money_and_selected_paymoney()"
});
formatter.result({
  "duration": 451937741,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_create_a_payment()"
});
formatter.result({
  "duration": 141981,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.i_check_all_the_details_are_validated(DataTable)"
});
formatter.result({
  "duration": 2402985,
  "status": "passed"
});
});