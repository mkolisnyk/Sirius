# encoding: UTF-8
require 'sirius/web/core/select/WebSelectServiceDriver.rb'


Sirius::Client::Web::Core::Select

endpoint_url = ARGV.shift
obj = WebSelect.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# SYNOPSIS
#   deselectAll(parameters)
#
# ARGS
#   parameters      DeselectAll - {http://web.server.sirius.org/}deselectAll
#
# RETURNS
#   parameters      DeselectAllResponse - {http://web.server.sirius.org/}deselectAllResponse
#
parameters = nil
puts obj.deselectAll(parameters)

# SYNOPSIS
#   isMultiple(parameters)
#
# ARGS
#   parameters      IsMultiple - {http://web.server.sirius.org/}isMultiple
#
# RETURNS
#   parameters      IsMultipleResponse - {http://web.server.sirius.org/}isMultipleResponse
#
parameters = nil
puts obj.isMultiple(parameters)

# SYNOPSIS
#   deselectByIndex(parameters)
#
# ARGS
#   parameters      DeselectByIndex - {http://web.server.sirius.org/}deselectByIndex
#
# RETURNS
#   parameters      DeselectByIndexResponse - {http://web.server.sirius.org/}deselectByIndexResponse
#
parameters = nil
puts obj.deselectByIndex(parameters)

# SYNOPSIS
#   deselectByValue(parameters)
#
# ARGS
#   parameters      DeselectByValue - {http://web.server.sirius.org/}deselectByValue
#
# RETURNS
#   parameters      DeselectByValueResponse - {http://web.server.sirius.org/}deselectByValueResponse
#
parameters = nil
puts obj.deselectByValue(parameters)

# SYNOPSIS
#   getAllOptions(parameters)
#
# ARGS
#   parameters      GetAllOptions - {http://web.server.sirius.org/}getAllOptions
#
# RETURNS
#   parameters      GetAllOptionsResponse - {http://web.server.sirius.org/}getAllOptionsResponse
#
parameters = nil
puts obj.getAllOptions(parameters)

# SYNOPSIS
#   selectByIndex(parameters)
#
# ARGS
#   parameters      SelectByIndex - {http://web.server.sirius.org/}selectByIndex
#
# RETURNS
#   parameters      SelectByIndexResponse - {http://web.server.sirius.org/}selectByIndexResponse
#
parameters = nil
puts obj.selectByIndex(parameters)

# SYNOPSIS
#   selectByValue(parameters)
#
# ARGS
#   parameters      SelectByValue - {http://web.server.sirius.org/}selectByValue
#
# RETURNS
#   parameters      SelectByValueResponse - {http://web.server.sirius.org/}selectByValueResponse
#
parameters = nil
puts obj.selectByValue(parameters)

# SYNOPSIS
#   selectByVisibleText(parameters)
#
# ARGS
#   parameters      SelectByVisibleText - {http://web.server.sirius.org/}selectByVisibleText
#
# RETURNS
#   parameters      SelectByVisibleTextResponse - {http://web.server.sirius.org/}selectByVisibleTextResponse
#
parameters = nil
puts obj.selectByVisibleText(parameters)

# SYNOPSIS
#   getAllSelectedOptions(parameters)
#
# ARGS
#   parameters      GetAllSelectedOptions - {http://web.server.sirius.org/}getAllSelectedOptions
#
# RETURNS
#   parameters      GetAllSelectedOptionsResponse - {http://web.server.sirius.org/}getAllSelectedOptionsResponse
#
parameters = nil
puts obj.getAllSelectedOptions(parameters)

# SYNOPSIS
#   getFirstSelectedOption(parameters)
#
# ARGS
#   parameters      GetFirstSelectedOption - {http://web.server.sirius.org/}getFirstSelectedOption
#
# RETURNS
#   parameters      GetFirstSelectedOptionResponse - {http://web.server.sirius.org/}getFirstSelectedOptionResponse
#
parameters = nil
puts obj.getFirstSelectedOption(parameters)

# SYNOPSIS
#   deselectByVisibleText(parameters)
#
# ARGS
#   parameters      DeselectByVisibleText - {http://web.server.sirius.org/}deselectByVisibleText
#
# RETURNS
#   parameters      DeselectByVisibleTextResponse - {http://web.server.sirius.org/}deselectByVisibleTextResponse
#
parameters = nil
puts obj.deselectByVisibleText(parameters)




Sirius::Client::Web::Core::Select
