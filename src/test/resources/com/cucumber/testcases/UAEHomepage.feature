Feature: Validate UAE Exchange home page
in order to apply to wheeler loan

Scenario: verify UAE Exchange home page
Given I navigate to UAE Exchange Landing page
When I clicked on Pay Money and selected paymoney
Then I create a payment
And I check all the details are validated
|YourMobile|AccountNo|Amount|BeneficiaryMobile|IFSCCode|
|777777777|777777777|3000	|77777777777|HDFC0000485	|
|888888888|888888888|4000	|8888888888888|HDFC0000485	|
|999999999|99999999 |5000	|9999999999999|HDFC0000485	|