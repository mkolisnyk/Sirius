#!/usr/bin/env ruby
require 'ButtonServiceDriver.rb'


Sirius::Client::Win32::Core::Button

endpoint_url = ARGV.shift
obj = Button.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getCheck(parameters)
#
# ARGS
#   parameters      GetCheck - {http://controls.classes.win32.server.sirius.org/}getCheck
#
# RETURNS
#   parameters      GetCheckResponse - {http://controls.classes.win32.server.sirius.org/}getCheckResponse
#
parameters = nil
puts obj.getCheck(parameters)

# SYNOPSIS
#   isPushed(parameters)
#
# ARGS
#   parameters      IsPushed - {http://controls.classes.win32.server.sirius.org/}isPushed
#
# RETURNS
#   parameters      IsPushedResponse - {http://controls.classes.win32.server.sirius.org/}isPushedResponse
#
parameters = nil
puts obj.isPushed(parameters)

# SYNOPSIS
#   isChecked(parameters)
#
# ARGS
#   parameters      IsChecked - {http://controls.classes.win32.server.sirius.org/}isChecked
#
# RETURNS
#   parameters      IsCheckedResponse - {http://controls.classes.win32.server.sirius.org/}isCheckedResponse
#
parameters = nil
puts obj.isChecked(parameters)

# SYNOPSIS
#   setCheck(parameters)
#
# ARGS
#   parameters      SetCheck - {http://controls.classes.win32.server.sirius.org/}setCheck
#
# RETURNS
#   parameters      SetCheckResponse - {http://controls.classes.win32.server.sirius.org/}setCheckResponse
#
parameters = nil
puts obj.setCheck(parameters)

# SYNOPSIS
#   isIntermediate(parameters)
#
# ARGS
#   parameters      IsIntermediate - {http://controls.classes.win32.server.sirius.org/}isIntermediate
#
# RETURNS
#   parameters      IsIntermediateResponse - {http://controls.classes.win32.server.sirius.org/}isIntermediateResponse
#
parameters = nil
puts obj.isIntermediate(parameters)

# SYNOPSIS
#   getState(parameters)
#
# ARGS
#   parameters      GetState - {http://controls.classes.win32.server.sirius.org/}getState
#
# RETURNS
#   parameters      GetStateResponse - {http://controls.classes.win32.server.sirius.org/}getStateResponse
#
parameters = nil
puts obj.getState(parameters)

# SYNOPSIS
#   setState(parameters)
#
# ARGS
#   parameters      SetState - {http://controls.classes.win32.server.sirius.org/}setState
#
# RETURNS
#   parameters      SetStateResponse - {http://controls.classes.win32.server.sirius.org/}setStateResponse
#
parameters = nil
puts obj.setState(parameters)




Sirius::Client::Win32::Core::Button
