#!/usr/bin/env ruby
require 'SpinServiceDriver.rb'


Sirius::Client::Win32::Core::Spin

endpoint_url = ARGV.shift
obj = Spin.new(endpoint_url)

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
#   getSmallStep(parameters)
#
# ARGS
#   parameters      GetSmallStep - {http://controls.classes.win32.server.sirius.org/}getSmallStep
#
# RETURNS
#   parameters      GetSmallStepResponse - {http://controls.classes.win32.server.sirius.org/}getSmallStepResponse
#
parameters = nil
puts obj.getSmallStep(parameters)

# SYNOPSIS
#   getLargeStep(parameters)
#
# ARGS
#   parameters      GetLargeStep - {http://controls.classes.win32.server.sirius.org/}getLargeStep
#
# RETURNS
#   parameters      GetLargeStepResponse - {http://controls.classes.win32.server.sirius.org/}getLargeStepResponse
#
parameters = nil
puts obj.getLargeStep(parameters)

# SYNOPSIS
#   increment(parameters)
#
# ARGS
#   parameters      Increment - {http://controls.classes.win32.server.sirius.org/}increment
#
# RETURNS
#   parameters      IncrementResponse - {http://controls.classes.win32.server.sirius.org/}incrementResponse
#
parameters = nil
puts obj.increment(parameters)

# SYNOPSIS
#   getText(parameters)
#
# ARGS
#   parameters      GetText - {http://controls.classes.win32.server.sirius.org/}getText
#
# RETURNS
#   parameters      GetTextResponse - {http://controls.classes.win32.server.sirius.org/}getTextResponse
#
parameters = nil
puts obj.getText(parameters)

# SYNOPSIS
#   setText(parameters)
#
# ARGS
#   parameters      SetText - {http://controls.classes.win32.server.sirius.org/}setText
#
# RETURNS
#   parameters      SetTextResponse - {http://controls.classes.win32.server.sirius.org/}setTextResponse
#
parameters = nil
puts obj.setText(parameters)

# SYNOPSIS
#   decrement(parameters)
#
# ARGS
#   parameters      Decrement - {http://controls.classes.win32.server.sirius.org/}decrement
#
# RETURNS
#   parameters      DecrementResponse - {http://controls.classes.win32.server.sirius.org/}decrementResponse
#
parameters = nil
puts obj.decrement(parameters)

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




Sirius::Client::Win32::Core::Spin
