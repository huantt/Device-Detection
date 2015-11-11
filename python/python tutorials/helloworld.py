#!/usr/bin/env python
'''
<tutorial>
<ol>
<li>Imports the detector and the settings file,
<li>Sets the data file, properties, cache size and pool size,
<li>Initialises the provider,
<li>Sets a User-Agent,
<li>Gets a match for the User-Agent. This returns a match object,
<li>Lists all the selected properties for the matched device.
</ol>
</tutorial>
'''
# // Snippet Start
from FiftyOneDegrees import fiftyone_degrees_mobile_detector_v3_wrapper
from fiftyone_degrees.mobile_detector.conf import settings
import sys

dataFile = settings.V3_WRAPPER_DATABASE
properties = 'BrowserName,BrowserVendor,BrowserVersion,DeviceType,HardwareVendor,IsTablet,IsMobile,IsCrawler,ScreenInchesDiagonal,ScreenPixelsWidth'
cacheSize = settings.CACHE_SIZE
poolSize = settings.POOL_SIZE

provider = fiftyone_degrees_mobile_detector_v3_wrapper.Provider(dataFile,
	properties,
	cacheSize,
	poolSize)

# User-Agent string of an iPhone mobile device.
mobileUserAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 7_1 like Mac OS X) AppleWebKit/537.51.2 (KHTML, like Gecko) 'Version/7.0 Mobile/11D167 Safari/9537.53"

# User-Agent string of Firefow Web browser version 41 on dektop.
desktopUserAgent = "Mozilla/5.0 (Windows NT 6.3; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0"

# User-Agent string of a MediaHub device.
mediaHubUserAgent = "Mozilla/5.0 (Linux; Android 4.4.2; X7 Quad Core Build/KOT49H) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Safari/537.36"

def output_properties(match):
	sys.stdout.write('User-Agent: %s\n' % match.getUserAgent())
	for name in properties.split(','):
		value = match.getValues(name)
		if value:
			sys.stdout.write('   %s: %s\n' % (name, ' '.join(value)))
		else:
			sys.stdout.write('   %s: %s\n' % (name, 'N/A in Lite'))

def main():
	sys.stdout.write('Mobile User-Agent: %s\n' % mobileUserAgent)
	match = provider.getMatch(mobileUserAgent)
	output_properties(match)
	sys.stdout.write('Desktop User-Agent: %s\n' % desktopUserAgent)
	match = provider.getMatch(desktopUserAgent)
	output_properties(match)
	sys.stdout.write('Media Hub User-Agent: %s\n' % mediaHubUserAgent)
	match = provider.getMatch(mediaHubUserAgent)
	output_properties(match)

if __name__ == '__main__':
	main()
# // Snippet End
