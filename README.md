# modularization-demo
Demo project implementing multi modules and modular architecture

## User journies

Generic user flow: Onboarding -> Dashboard -> Feature a,b,c...

(Onboarding not implemented at this stage)

<img src="/images/image1.png" width="600">

Dashboard contains the following navigation patterns:

Bottom tabs: Home, Dashboard & Notifications

<img src="/images/image2.png" width="600">

Within Home, I implemented a simplified user purchase journey to demonstrate deep navigation:

Home -> Product page -> Payment page -> Confirmation page -> Back to Home

<img src="/images/image3.png" width="600">

## Architecture

<img src="/images/image4.png" width="600">

app module sits on top and includes mainly the dependency injection

Feature modules sits below for each specific module

core-android sits below the feature modules and includes and common code all feature modules could share

core-injection - as the name suggests

core-data - contains the data layer, and API calls, data caching etc, at a later stage when the app evolves one should consider breaking it into multiple modules.

core-navigation - in charge of navigation between modules
