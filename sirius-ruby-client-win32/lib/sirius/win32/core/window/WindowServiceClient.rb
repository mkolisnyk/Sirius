#!/usr/bin/env ruby
require 'WindowServiceDriver.rb'

Sirius::Client::Win32::Core::Window

endpoint_url = ARGV.shift
obj = Window.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getWindowPlacement(parameters)
#
# ARGS
#   parameters      GetWindowPlacement - {http://classes.win32.server.sirius.org/}getWindowPlacement
#
# RETURNS
#   parameters      GetWindowPlacementResponse - {http://classes.win32.server.sirius.org/}getWindowPlacementResponse
#
parameters = nil
puts obj.getWindowPlacement(parameters)

# SYNOPSIS
#   getSystemMenu(parameters)
#
# ARGS
#   parameters      GetSystemMenu - {http://classes.win32.server.sirius.org/}getSystemMenu
#
# RETURNS
#   parameters      GetSystemMenuResponse - {http://classes.win32.server.sirius.org/}getSystemMenuResponse
#
parameters = nil
puts obj.getSystemMenu(parameters)

# SYNOPSIS
#   getClientRect(parameters)
#
# ARGS
#   parameters      GetClientRect - {http://classes.win32.server.sirius.org/}getClientRect
#
# RETURNS
#   parameters      GetClientRectResponse - {http://classes.win32.server.sirius.org/}getClientRectResponse
#
parameters = nil
puts obj.getClientRect(parameters)

# SYNOPSIS
#   doubleClick(parameters)
#
# ARGS
#   parameters      DoubleClick - {http://classes.win32.server.sirius.org/}doubleClick
#
# RETURNS
#   parameters      DoubleClickResponse - {http://classes.win32.server.sirius.org/}doubleClickResponse
#
parameters = nil
puts obj.doubleClick(parameters)

# SYNOPSIS
#   keyPress(parameters)
#
# ARGS
#   parameters      KeyPress - {http://classes.win32.server.sirius.org/}keyPress
#
# RETURNS
#   parameters      KeyPressResponse - {http://classes.win32.server.sirius.org/}keyPressResponse
#
parameters = nil
puts obj.keyPress(parameters)

# SYNOPSIS
#   getRect(parameters)
#
# ARGS
#   parameters      GetRect - {http://classes.win32.server.sirius.org/}getRect
#
# RETURNS
#   parameters      GetRectResponse - {http://classes.win32.server.sirius.org/}getRectResponse
#
parameters = nil
puts obj.getRect(parameters)

# SYNOPSIS
#   isMaximized(parameters)
#
# ARGS
#   parameters      IsMaximized - {http://classes.win32.server.sirius.org/}isMaximized
#
# RETURNS
#   parameters      IsMaximizedResponse - {http://classes.win32.server.sirius.org/}isMaximizedResponse
#
parameters = nil
puts obj.isMaximized(parameters)

# SYNOPSIS
#   isMinimized(parameters)
#
# ARGS
#   parameters      IsMinimized - {http://classes.win32.server.sirius.org/}isMinimized
#
# RETURNS
#   parameters      IsMinimizedResponse - {http://classes.win32.server.sirius.org/}isMinimizedResponse
#
parameters = nil
puts obj.isMinimized(parameters)

# SYNOPSIS
#   isUnicode(parameters)
#
# ARGS
#   parameters      IsUnicode - {http://classes.win32.server.sirius.org/}isUnicode
#
# RETURNS
#   parameters      IsUnicodeResponse - {http://classes.win32.server.sirius.org/}isUnicodeResponse
#
parameters = nil
puts obj.isUnicode(parameters)

# SYNOPSIS
#   isWindow(parameters)
#
# ARGS
#   parameters      IsWindow - {http://classes.win32.server.sirius.org/}isWindow
#
# RETURNS
#   parameters      IsWindowResponse - {http://classes.win32.server.sirius.org/}isWindowResponse
#
parameters = nil
puts obj.isWindow(parameters)

# SYNOPSIS
#   sizeTo(parameters)
#
# ARGS
#   parameters      SizeTo - {http://classes.win32.server.sirius.org/}sizeTo
#
# RETURNS
#   parameters      SizeToResponse - {http://classes.win32.server.sirius.org/}sizeToResponse
#
parameters = nil
puts obj.sizeTo(parameters)

# SYNOPSIS
#   start(parameters)
#
# ARGS
#   parameters      Start - {http://classes.win32.server.sirius.org/}start
#
# RETURNS
#   parameters      StartResponse - {http://classes.win32.server.sirius.org/}startResponse
#
parameters = nil
puts obj.start(parameters)

# SYNOPSIS
#   close(parameters)
#
# ARGS
#   parameters      Close - {http://classes.win32.server.sirius.org/}close
#
# RETURNS
#   parameters      CloseResponse - {http://classes.win32.server.sirius.org/}closeResponse
#
parameters = nil
puts obj.close(parameters)

# SYNOPSIS
#   isVisible(parameters)
#
# ARGS
#   parameters      IsVisible - {http://classes.win32.server.sirius.org/}isVisible
#
# RETURNS
#   parameters      IsVisibleResponse - {http://classes.win32.server.sirius.org/}isVisibleResponse
#
parameters = nil
puts obj.isVisible(parameters)

# SYNOPSIS
#   isEnabled(parameters)
#
# ARGS
#   parameters      IsEnabled - {http://classes.win32.server.sirius.org/}isEnabled
#
# RETURNS
#   parameters      IsEnabledResponse - {http://classes.win32.server.sirius.org/}isEnabledResponse
#
parameters = nil
puts obj.isEnabled(parameters)

# SYNOPSIS
#   keyDown(parameters)
#
# ARGS
#   parameters      KeyDown - {http://classes.win32.server.sirius.org/}keyDown
#
# RETURNS
#   parameters      KeyDownResponse - {http://classes.win32.server.sirius.org/}keyDownResponse
#
parameters = nil
puts obj.keyDown(parameters)

# SYNOPSIS
#   keyUp(parameters)
#
# ARGS
#   parameters      KeyUp - {http://classes.win32.server.sirius.org/}keyUp
#
# RETURNS
#   parameters      KeyUpResponse - {http://classes.win32.server.sirius.org/}keyUpResponse
#
parameters = nil
puts obj.keyUp(parameters)

# SYNOPSIS
#   mouseDown(parameters)
#
# ARGS
#   parameters      MouseDown - {http://classes.win32.server.sirius.org/}mouseDown
#
# RETURNS
#   parameters      MouseDownResponse - {http://classes.win32.server.sirius.org/}mouseDownResponse
#
parameters = nil
puts obj.mouseDown(parameters)

# SYNOPSIS
#   mouseUp(parameters)
#
# ARGS
#   parameters      MouseUp - {http://classes.win32.server.sirius.org/}mouseUp
#
# RETURNS
#   parameters      MouseUpResponse - {http://classes.win32.server.sirius.org/}mouseUpResponse
#
parameters = nil
puts obj.mouseUp(parameters)

# SYNOPSIS
#   move(parameters)
#
# ARGS
#   parameters      Move - {http://classes.win32.server.sirius.org/}move
#
# RETURNS
#   parameters      MoveResponse - {http://classes.win32.server.sirius.org/}moveResponse
#
parameters = nil
puts obj.move(parameters)

# SYNOPSIS
#   getText(parameters)
#
# ARGS
#   parameters      GetText - {http://classes.win32.server.sirius.org/}getText
#
# RETURNS
#   parameters      GetTextResponse - {http://classes.win32.server.sirius.org/}getTextResponse
#
parameters = nil
puts obj.getText(parameters)

# SYNOPSIS
#   activate(parameters)
#
# ARGS
#   parameters      Activate - {http://classes.win32.server.sirius.org/}activate
#
# RETURNS
#   parameters      ActivateResponse - {http://classes.win32.server.sirius.org/}activateResponse
#
parameters = nil
puts obj.activate(parameters)

# SYNOPSIS
#   moveTo(parameters)
#
# ARGS
#   parameters      MoveTo - {http://classes.win32.server.sirius.org/}moveTo
#
# RETURNS
#   parameters      MoveToResponse - {http://classes.win32.server.sirius.org/}moveToResponse
#
parameters = nil
puts obj.moveTo(parameters)

# SYNOPSIS
#   maximize(parameters)
#
# ARGS
#   parameters      Maximize - {http://classes.win32.server.sirius.org/}maximize
#
# RETURNS
#   parameters      MaximizeResponse - {http://classes.win32.server.sirius.org/}maximizeResponse
#
parameters = nil
puts obj.maximize(parameters)

# SYNOPSIS
#   minimize(parameters)
#
# ARGS
#   parameters      Minimize - {http://classes.win32.server.sirius.org/}minimize
#
# RETURNS
#   parameters      MinimizeResponse - {http://classes.win32.server.sirius.org/}minimizeResponse
#
parameters = nil
puts obj.minimize(parameters)

# SYNOPSIS
#   restore(parameters)
#
# ARGS
#   parameters      Restore - {http://classes.win32.server.sirius.org/}restore
#
# RETURNS
#   parameters      RestoreResponse - {http://classes.win32.server.sirius.org/}restoreResponse
#
parameters = nil
puts obj.restore(parameters)

# SYNOPSIS
#   click(parameters)
#
# ARGS
#   parameters      Click - {http://classes.win32.server.sirius.org/}click
#
# RETURNS
#   parameters      ClickResponse - {http://classes.win32.server.sirius.org/}clickResponse
#
parameters = nil
puts obj.click(parameters)

# SYNOPSIS
#   getMenu(parameters)
#
# ARGS
#   parameters      GetMenu - {http://classes.win32.server.sirius.org/}getMenu
#
# RETURNS
#   parameters      GetMenuResponse - {http://classes.win32.server.sirius.org/}getMenuResponse
#
parameters = nil
puts obj.getMenu(parameters)

# SYNOPSIS
#   isNormal(parameters)
#
# ARGS
#   parameters      IsNormal - {http://classes.win32.server.sirius.org/}isNormal
#
# RETURNS
#   parameters      IsNormalResponse - {http://classes.win32.server.sirius.org/}isNormalResponse
#
parameters = nil
puts obj.isNormal(parameters)

Sirius::Client::Win32::Core::Window
