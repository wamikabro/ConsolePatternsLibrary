# ConsolePatternsLibrary
<p>Your all-in-one library that contains all the patterns that you would love to visualize in your console window. Your contributions are welcomed. Together we build beautiful patterns.</p>
<p><b>Note: Before Committing, must read How to Contribute?, Supported Languages and Contribution Rules.</b></p>
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
  <li>Make default access class with your Pattern's Method name in pascal case inside Java package. (pattern's method name is defined in details below). </li>
  <li>Pattern must be made inside a <b>protected static void</b> type method.</li>
  <li>Method name should be pattern().</li>
  <li>Method should contain single pattern.</li>
  <li>You can use multiple private methods to support your protected method.</li>
  <li>You can use asteric(stars), numbers, symbols and alphabets (and their mixture) in the pattern. (Basically all the ascii supported characters)</li>
  <li>Only For loop from the loops and its variations are allowed.</li>
  <li>Temporarily make main method and call your method inside it to verify it's working fine and screenshot the output.</li>
  <li>Call your method inside another public method in JavaPatterns.java class present in the Java package (Let's call this method <i><b>Pattern's method</b></i>). (make sure to pass all the parameters respectively from the newly created method to the method that you called.</li>
  <li>Pattern's Method name should be in Camel Case.</li>
  <li>Pattern's Method name should be in this format <br/>
[DataType] [PatternType] [Idea] eg. numberedHollowTriangle(). (You can get an idea from the already written code above in the file).<br/>
DataType = Numbered / Alphabetic / Symboled / Mixed     Default: Asterisk (No need to  mention it) <br/>
PatternType = Solid / Hollow / Mixed<br/>
Idea = Meaningful Name for your idea. (Use pascal case for compound words eg. PakistaniFlag)
  </li>
  <li>Add the Pattern's Method name, Signature and Screenshot of the result. (You can get an idea from the already written code above in the file).</li>
</ol>
<p>You will get an idea easily after forking and then cloning the repository. Every default class contains documentation that will help you work.</p>
<p>Thanks for the contribution in advance!</p>
