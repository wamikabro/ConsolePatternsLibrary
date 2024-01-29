# ConsolePatternsLibrary
<p>Your all in one library that contains all the patterns that you would love to visualize in your console window. Your contributions are welcomed. Together we build beautiful patterns.</p>
<p><b>Note: Before Commiting, must read How to Contribute?, Supported Languages and Contribution Rules.</b></p>
<h2>Supported Languages</h2>
<ol>
  <li>Java</li>
  (We've temporarily removed python support.)
</ol>

<h2>How to Contribute?</h2>
<ol>
  <li>Make sure no similiar issue/pull request is open. If similar issue is open, you can comment on it to get the permission to work on that pattern (Only if the author of the issue haven't mentioned that he wants to add the pattern himself).</li>
  <li>Open an Issue describing your idea of pattern also tell the language you wanna work on (Supported languages are mentioned above).</li>
  <li>Showing result image of pattern (if possible). Keep it as small as possible in demonstration eg. Square pattern of 5x5 instead of 10x10)</li>
  <li>Mention that you want to do it yourself in the issue.</li>
  <li>Fork the repository.</li>
  <li>Clone your forked repository and work on your pattern.</li>
  <li>Open a Pull Request once you're done.</li>
</ol>

<h2>Rules and Guide to Contribution</h2>
<ol>
  <li>Make sure the language you're going to use is present in supported languages section above.</li>
  <li>Make sure pattern isn't already available in the same language.</li>
  <li>Pattern must not contain nudity, racism or hate visuals (Country or Ethnic Flags are allowed).</li>
  <li>Make sure to add single pattern in single contribution. You're welcomed to do multiple contributions.</li>
  <li>Pattern must be dynamic. Even if it's based on different dimensions, it must take some sort of size as input.</li>
  <li>Make class with your method name in pascal case inside your specified language Folder. (method name is defined in details below). </li>
  <li>Pattern must be made inside a <b>private static int</b> return type method.</li>
  <li>Method name should be pattern().</li>
  <li>Method should contain single pattern.</li>
  <li>You can use multiple private methods to support your private method.</li>
  <li>You can use asteric(stars), numbers, symbols and alphabets (and their mixture) in the pattern. (Basically all the ascii supported characters)</li>
  <li>Only For loop from the loops and its variations are allowed.</li>
  <li>Call your method inside another public method in your language specified main class present in the repository. eg. JavaPatterns.java (make sure to pass all the parameters respectfully from the newly created method to the method that you called. (your protected pattern method from the class that you created)</li>
  <li>Newly created Method's name should be in Camel Case.</li>
  <li>Newly created Method's name should be in this format <br/>
[DataType] [PatternType] [Idea] eg. numberedHollowTriangle(). (You can get an idea from the already written code above in the file).<br/>
DataType = Numbered / Alphabetic / Symboled / Mixed     Default: Asterisk (No need to  mention it) <br/>
PatternType = Hollow / Mixed     Default: Filled (No need to mention it) <br/>
Idea = Meaningful Name for your idea. (Use pascal case for compound words eg. PakistaniFlag)
  </li>
  <li>Add the newly created method name and image of the result of calling it inside specified language pattern list. eg. JavaPatternList (You can get an idea from the already written code above in the file).</li>
</ol>
