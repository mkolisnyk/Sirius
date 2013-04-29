#!/usr/bin/env ruby
require 'sirius/web/core/WebCoreServiceDriver.rb'


Sirius::Client::Web::Core

endpoint_url = ARGV.shift
obj = WebCore.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getWindowHandle(parameters)
#
# ARGS
#   parameters      GetWindowHandle - {http://web.server.sirius.org/}getWindowHandle
#
# RETURNS
#   parameters      GetWindowHandleResponse - {http://web.server.sirius.org/}getWindowHandleResponse
#
parameters = nil
puts obj.getWindowHandle(parameters)

# SYNOPSIS
#   selectFrameByName(parameters)
#
# ARGS
#   parameters      SelectFrameByName - {http://web.server.sirius.org/}selectFrameByName
#
# RETURNS
#   parameters      SelectFrameByNameResponse - {http://web.server.sirius.org/}selectFrameByNameResponse
#
parameters = nil
puts obj.selectFrameByName(parameters)

# SYNOPSIS
#   selectDefaultContent(parameters)
#
# ARGS
#   parameters      SelectDefaultContent - {http://web.server.sirius.org/}selectDefaultContent
#
# RETURNS
#   parameters      SelectDefaultContentResponse - {http://web.server.sirius.org/}selectDefaultContentResponse
#
parameters = nil
puts obj.selectDefaultContent(parameters)

# SYNOPSIS
#   getPageSource(parameters)
#
# ARGS
#   parameters      GetPageSource - {http://web.server.sirius.org/}getPageSource
#
# RETURNS
#   parameters      GetPageSourceResponse - {http://web.server.sirius.org/}getPageSourceResponse
#
parameters = nil
puts obj.getPageSource(parameters)

# SYNOPSIS
#   selectFrameByIndex(parameters)
#
# ARGS
#   parameters      SelectFrameByIndex - {http://web.server.sirius.org/}selectFrameByIndex
#
# RETURNS
#   parameters      SelectFrameByIndexResponse - {http://web.server.sirius.org/}selectFrameByIndexResponse
#
parameters = nil
puts obj.selectFrameByIndex(parameters)

# SYNOPSIS
#   back(parameters)
#
# ARGS
#   parameters      Back - {http://web.server.sirius.org/}back
#
# RETURNS
#   parameters      BackResponse - {http://web.server.sirius.org/}backResponse
#
parameters = nil
puts obj.back(parameters)

# SYNOPSIS
#   isDisplayed(parameters)
#
# ARGS
#   parameters      IsDisplayed - {http://web.server.sirius.org/}isDisplayed
#
# RETURNS
#   parameters      IsDisplayedResponse - {http://web.server.sirius.org/}isDisplayedResponse
#
parameters = nil
puts obj.isDisplayed(parameters)

# SYNOPSIS
#   getCssValue(parameters)
#
# ARGS
#   parameters      GetCssValue - {http://web.server.sirius.org/}getCssValue
#
# RETURNS
#   parameters      GetCssValueResponse - {http://web.server.sirius.org/}getCssValueResponse
#
parameters = nil
puts obj.getCssValue(parameters)

# SYNOPSIS
#   sendKeys(parameters)
#
# ARGS
#   parameters      SendKeys - {http://web.server.sirius.org/}sendKeys
#
# RETURNS
#   parameters      SendKeysResponse - {http://web.server.sirius.org/}sendKeysResponse
#
parameters = nil
puts obj.sendKeys(parameters)

# SYNOPSIS
#   forward(parameters)
#
# ARGS
#   parameters      Forward - {http://web.server.sirius.org/}forward
#
# RETURNS
#   parameters      ForwardResponse - {http://web.server.sirius.org/}forwardResponse
#
parameters = nil
puts obj.forward(parameters)

# SYNOPSIS
#   selectWindow(parameters)
#
# ARGS
#   parameters      SelectWindow - {http://web.server.sirius.org/}selectWindow
#
# RETURNS
#   parameters      SelectWindowResponse - {http://web.server.sirius.org/}selectWindowResponse
#
parameters = nil
puts obj.selectWindow(parameters)

# SYNOPSIS
#   selectAlert(parameters)
#
# ARGS
#   parameters      SelectAlert - {http://web.server.sirius.org/}selectAlert
#
# RETURNS
#   parameters      SelectAlertResponse - {http://web.server.sirius.org/}selectAlertResponse
#
parameters = nil
puts obj.selectAlert(parameters)

# SYNOPSIS
#   getLocation(parameters)
#
# ARGS
#   parameters      GetLocation - {http://web.server.sirius.org/}getLocation
#
# RETURNS
#   parameters      GetLocationResponse - {http://web.server.sirius.org/}getLocationResponse
#
parameters = nil
puts obj.getLocation(parameters)

# SYNOPSIS
#   getURL(parameters)
#
# ARGS
#   parameters      GetURL - {http://web.server.sirius.org/}getURL
#
# RETURNS
#   parameters      GetURLResponse - {http://web.server.sirius.org/}getURLResponse
#
parameters = nil
puts obj.getURL(parameters)

# SYNOPSIS
#   clear(parameters)
#
# ARGS
#   parameters      Clear - {http://web.server.sirius.org/}clear
#
# RETURNS
#   parameters      ClearResponse - {http://web.server.sirius.org/}clearResponse
#
parameters = nil
puts obj.clear(parameters)

# SYNOPSIS
#   start(parameters)
#
# ARGS
#   parameters      Start - {http://web.server.sirius.org/}start
#
# RETURNS
#   parameters      StartResponse - {http://web.server.sirius.org/}startResponse
#
parameters = nil
puts obj.start(parameters)

# SYNOPSIS
#   stop(parameters)
#
# ARGS
#   parameters      Stop - {http://web.server.sirius.org/}stop
#
# RETURNS
#   parameters      StopResponse - {http://web.server.sirius.org/}stopResponse
#
parameters = nil
puts obj.stop(parameters)

# SYNOPSIS
#   getSize(parameters)
#
# ARGS
#   parameters      GetSize - {http://web.server.sirius.org/}getSize
#
# RETURNS
#   parameters      GetSizeResponse - {http://web.server.sirius.org/}getSizeResponse
#
parameters = nil
puts obj.getSize(parameters)

# SYNOPSIS
#   open(parameters)
#
# ARGS
#   parameters      Open - {http://web.server.sirius.org/}open
#
# RETURNS
#   parameters      OpenResponse - {http://web.server.sirius.org/}openResponse
#
parameters = nil
puts obj.open(parameters)

# SYNOPSIS
#   refresh(parameters)
#
# ARGS
#   parameters      Refresh - {http://web.server.sirius.org/}refresh
#
# RETURNS
#   parameters      RefreshResponse - {http://web.server.sirius.org/}refreshResponse
#
parameters = nil
puts obj.refresh(parameters)

# SYNOPSIS
#   getTitle(parameters)
#
# ARGS
#   parameters      GetTitle - {http://web.server.sirius.org/}getTitle
#
# RETURNS
#   parameters      GetTitleResponse - {http://web.server.sirius.org/}getTitleResponse
#
parameters = nil
puts obj.getTitle(parameters)

# SYNOPSIS
#   isEnabled(parameters)
#
# ARGS
#   parameters      IsEnabled - {http://web.server.sirius.org/}isEnabled
#
# RETURNS
#   parameters      IsEnabledResponse - {http://web.server.sirius.org/}isEnabledResponse
#
parameters = nil
puts obj.isEnabled(parameters)

# SYNOPSIS
#   getText(parameters)
#
# ARGS
#   parameters      GetText - {http://web.server.sirius.org/}getText
#
# RETURNS
#   parameters      GetTextResponse - {http://web.server.sirius.org/}getTextResponse
#
parameters = nil
puts obj.getText(parameters)

# SYNOPSIS
#   submit(parameters)
#
# ARGS
#   parameters      Submit - {http://web.server.sirius.org/}submit
#
# RETURNS
#   parameters      SubmitResponse - {http://web.server.sirius.org/}submitResponse
#
parameters = nil
puts obj.submit(parameters)

# SYNOPSIS
#   click(parameters)
#
# ARGS
#   parameters      Click - {http://web.server.sirius.org/}click
#
# RETURNS
#   parameters      ClickResponse - {http://web.server.sirius.org/}clickResponse
#
parameters = nil
puts obj.click(parameters)

# SYNOPSIS
#   isSelected(parameters)
#
# ARGS
#   parameters      IsSelected - {http://web.server.sirius.org/}isSelected
#
# RETURNS
#   parameters      IsSelectedResponse - {http://web.server.sirius.org/}isSelectedResponse
#
parameters = nil
puts obj.isSelected(parameters)

# SYNOPSIS
#   getAttribute(parameters)
#
# ARGS
#   parameters      GetAttribute - {http://web.server.sirius.org/}getAttribute
#
# RETURNS
#   parameters      GetAttributeResponse - {http://web.server.sirius.org/}getAttributeResponse
#
parameters = nil
puts obj.getAttribute(parameters)

# SYNOPSIS
#   getTagName(parameters)
#
# ARGS
#   parameters      GetTagName - {http://web.server.sirius.org/}getTagName
#
# RETURNS
#   parameters      GetTagNameResponse - {http://web.server.sirius.org/}getTagNameResponse
#
parameters = nil
puts obj.getTagName(parameters)




Sirius::Client::Web::Core
