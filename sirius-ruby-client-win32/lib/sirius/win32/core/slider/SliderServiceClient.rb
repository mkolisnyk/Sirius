#!/usr/bin/env ruby
require 'SliderServiceDriver.rb'


Sirius::Client::Win32::Core::Slider

endpoint_url = ARGV.shift
obj = Slider.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   getLowerBound(parameters)
#
# ARGS
#   parameters      GetLowerBound - {http://controls.classes.win32.server.sirius.org/}getLowerBound
#
# RETURNS
#   parameters      GetLowerBoundResponse - {http://controls.classes.win32.server.sirius.org/}getLowerBoundResponse
#
parameters = nil
puts obj.getLowerBound(parameters)

# SYNOPSIS
#   getUpperBound(parameters)
#
# ARGS
#   parameters      GetUpperBound - {http://controls.classes.win32.server.sirius.org/}getUpperBound
#
# RETURNS
#   parameters      GetUpperBoundResponse - {http://controls.classes.win32.server.sirius.org/}getUpperBoundResponse
#
parameters = nil
puts obj.getUpperBound(parameters)

# SYNOPSIS
#   getPosition(parameters)
#
# ARGS
#   parameters      GetPosition - {http://controls.classes.win32.server.sirius.org/}getPosition
#
# RETURNS
#   parameters      GetPositionResponse - {http://controls.classes.win32.server.sirius.org/}getPositionResponse
#
parameters = nil
puts obj.getPosition(parameters)

# SYNOPSIS
#   setPosition(parameters)
#
# ARGS
#   parameters      SetPosition - {http://controls.classes.win32.server.sirius.org/}setPosition
#
# RETURNS
#   parameters      SetPositionResponse - {http://controls.classes.win32.server.sirius.org/}setPositionResponse
#
parameters = nil
puts obj.setPosition(parameters)




Sirius::Client::Win32::Core::Slider
