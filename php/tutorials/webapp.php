<?php
/*
<tutorial>
<ol>
<li>Loads the 51Degrees PHP module,
<li>Instanciates a match provider,
<li>Fetches the available properties from the new
provider and converts to array form,
<li>Performs a match with requests User-Agent,
<li>Prints a list of requested properties
and their values.
</ol>
</tutorial>
*/
// Snippet Start
require("FiftyOneDegreesPatternV3.php");

$provider = FiftyOneDegreesPatternV3::provider_get();

$match = $provider->getMatch($_SERVER["HTTP_USER_AGENT"]);

if ($match->getValue("IsMobile") == "True") {
	echo "Mobile Site";
}
else {
	echo "Desktop Site";
}
// Snippet End
?>
