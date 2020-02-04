# What is JavaScript?
JavaScript is a programming language that lets you supercharge your HTML with animation, interactivity, and dynamic visual effects.
Turns boring old HTML and CSS into something interactive and fun through things as simple as a pop up to (but not limited to) animated slideshows.

## History
Invented in 10 days by Brendan Eich at Netscape in 1995. Originally called LiveScript until Sun Microsystems (Java) bought it. Also known by ECMAScript which is the official JavaScript specification that is developed and maintained by an international standards organization called Ecma International.

# What is JQuery
JavaScript needs to face it... It's absolutely terrible to write anything with it.  Additionally browsers often understand JavaScript a little bit different, making it difficult for Web Devs.  JQuery aimed to help this.
It's a JavaScript library that that aims to simplifiy difficult tasks and solve cross browser problems.

# HTML
JavaScript is pretty useless on its own. It requires the help of HTML and CSS to be the backbone of the web page.  HTML provides the structural layer. CSS provides the presentational layer making HTML look good. Finally JavaScript adds a behavioral layer, bringing a page to life to interact with web visitors.

In otherwords, you need to have a decent understanding of HTML and CSS.

```HTML
<!DOCTYPE html>
<html>
<head>
  <meta charset=utf-8>
  <title>I am a Title for this web page.</title>
</head>
<body>
  <p>I am some text on this webpage</p>
</body>
</html>
```

# CSS
CSS is a formatting language lets you make your webpage look good. It has a very specific syntax shown below:

```css
p { color: red; font-size: 1.5em;}
```

- <b>Selector</b> tells the browser which element(s) on a page to style. In the figure above, this would be the `p` for formatting all <em>paragragph</em> tags

- <b>Declaration Block</b> A block is defined by curly braces { }, anything between these are known as formatting options you want to apply to the selector.

- <b>Declaration</b> Between the opening and closing curly braces { }, you add one or more declarations/formatting instructions. 
Each declaration is broken up into two parts, a <em>property</em> and a <em>value</em>. A colon `:` is used to separate the two.
  - Our first declaration looks like `color: red;` where `color` is the property and `red` is the value. Note the use of semi-colon!

- <b>Property</b> There are a wide range of formatting options known as <em>properties</em>. 
A property is either a word or a few hyphenated words that indicate a certain style effect, ie `font-size`, `margin`, `background-color`, etc.

- <b>Value</b> Values allow you to express your creativity by assigning a value to a CSS property. 
Different properties require specific types of values, ie a color may be `red` or `#FF0000`, a length `18px`, `2in`, `5em`. 
A URL `images/background.gif`, or a keyword like `top`, `center`, `bottom`, etc.