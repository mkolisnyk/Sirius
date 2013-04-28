#!/usr/bin/env ruby
require 'sirius/internal/InternalServiceDriver.rb'


Sirius::Client::Internal

endpoint_url = ARGV.shift
obj = Internal.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   stop(parameters)
#
# ARGS
#   parameters      Stop - {http://server.sirius.org/}stop
#
# RETURNS
#   parameters      StopResponse - {http://server.sirius.org/}stopResponse
#
parameters = nil
puts obj.stop(parameters)




Sirius::Client::Internal
