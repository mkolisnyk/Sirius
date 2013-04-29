#!/usr/bin/env ruby
require 'sirius/win32/core/button/ButtonServiceDriver.rb'

Sirius::Client::Win32::Core::Button

endpoint_url = ARGV.shift
obj = Button.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   setState(parameters)
#
# ARGS
#   parameters      SetState - {http://controls.classes.win32.server.sirius.org/}SetState
#
# RETURNS
#   parameters      SetStateResponse - {http://controls.classes.win32.server.sirius.org/}SetStateResponse
#
parameters = nil
puts obj.setState(parameters)

# SYNOPSIS
#   setCheck(parameters)
#
# ARGS
#   parameters      SetCheck - {http://controls.classes.win32.server.sirius.org/}SetCheck
#
# RETURNS
#   parameters      SetCheckResponse - {http://controls.classes.win32.server.sirius.org/}SetCheckResponse
#
parameters = nil
puts obj.setCheck(parameters)

# SYNOPSIS
#   getState(parameters)
#
# ARGS
#   parameters      GetState - {http://controls.classes.win32.server.sirius.org/}GetState
#
# RETURNS
#   parameters      GetStateResponse - {http://controls.classes.win32.server.sirius.org/}GetStateResponse
#
parameters = nil
puts obj.getState(parameters)

# SYNOPSIS
#   getCheck(parameters)
#
# ARGS
#   parameters      GetCheck - {http://controls.classes.win32.server.sirius.org/}GetCheck
#
# RETURNS
#   parameters      GetCheckResponse - {http://controls.classes.win32.server.sirius.org/}GetCheckResponse
#
parameters = nil
puts obj.getCheck(parameters)

Sirius::Client::Win32::Core::Button
