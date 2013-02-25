#!/usr/bin/env ruby
require 'Win32UtilsServiceDriver.rb'


Sirius::Win32::Core::Utils

endpoint_url = ARGV.shift
obj = Win32Utils.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   searchWindow(parameters)
#
# ARGS
#   parameters      SearchWindow - {http://win32.server.sirius.org/}searchWindow
#
# RETURNS
#   parameters      SearchWindowResponse - {http://win32.server.sirius.org/}searchWindowResponse
#
parameters = nil
puts obj.searchWindow(parameters)

# SYNOPSIS
#   searchSameThreadWindow(parameters)
#
# ARGS
#   parameters      SearchSameThreadWindow - {http://win32.server.sirius.org/}searchSameThreadWindow
#
# RETURNS
#   parameters      SearchSameThreadWindowResponse - {http://win32.server.sirius.org/}searchSameThreadWindowResponse
#
parameters = nil
puts obj.searchSameThreadWindow(parameters)




Sirius::Win32::Core::Utils
