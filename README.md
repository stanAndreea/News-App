# News-App
News App for Android Basics by Google Nanodegree Program

**App contains a main screen which displays multiple news stories**

**API Query**

  App queries the content.guardianapis.com api to fetch news stories related to the topic chosen by the student, using either the ‘test’ api key or the student’s key.
  
**JSON Parsing**

  The JSON response is parsed correctly, and relevant information is stored in the app.
  
**Response Validation**

  The app checks whether the device is connected to the internet and responds appropriately. The result of the request is validated to account for a bad server response or lack of server response.

**List Item Contents**

  Each list item on the main screen displays relevant text and information about the story.

  The title of the article and the name of the section that it belongs to are required field.

  If available, author name and date published should be included. Please note not all responses will contain these pieces of data, but it is required to include them if they are present.
  
**Use of Loaders**

  Networking operations are done using a Loader rather than an AsyncTask.




**For Stage2: **

**Preference Summary**

  Settings Activity allows users to see the value of all the preferences right below the preference name, and when the value is changed, the summary updates immediate.

**Settings Activity**

  Settings Activity is accessed from the Main Activity via a Navigation Drawer or from the toolbar menu.

  In accordance with Material Design Guidelines, it should be reached via the "Settings" label. Do not use synonyms such as "Options" or "Preferences."


**Stage1 : Main window: **

![screenshot_20180426_165101](https://user-images.githubusercontent.com/35422422/39311511-c963935a-4975-11e8-8012-59d0cc720852.png)

**Stage1 :  Second window, News display**

![screenshot_20180426_165115](https://user-images.githubusercontent.com/35422422/39311517-cc42507a-4975-11e8-850f-d60d8ad1df8c.png)

**Stage2 : Main window:**

![screenshot_20180426_165150](https://user-images.githubusercontent.com/35422422/39312059-3411ccd4-4977-11e8-88e4-2232a68840ca.png)
![screenshot_20180426_165157](https://user-images.githubusercontent.com/35422422/39312066-37affe2e-4977-11e8-87d7-a7d97dc7d05f.png)

**Stage2 : Preferences**
![screenshot_20180426_165204](https://user-images.githubusercontent.com/35422422/39312132-6ed50034-4977-11e8-9d70-71019e3b5e44.png)
![screenshot_20180426_165211](https://user-images.githubusercontent.com/35422422/39312136-711f5696-4977-11e8-8596-10619da38561.png)
![screenshot_20180426_165221](https://user-images.githubusercontent.com/35422422/39312138-738836a0-4977-11e8-8ee9-bf77f3f379a4.png)


