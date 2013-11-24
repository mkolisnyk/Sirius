require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Listbox


# {http:controls.classes.win32.server.sirius.org/}equals
#   arg0 - (any)
class Equals    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}equalsResponse
#   m_return - SOAP::SOAPBoolean
class EqualsResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}selectByIndex
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPInt
class SelectByIndex    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}selectByIndexResponse
class SelectByIndexResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}getItemNames
#   arg0 - SOAP::SOAPInt
class GetItemNames    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getItemNamesResponse
class GetItemNamesResponse < ::Array
end
# {http:controls.classes.win32.server.sirius.org/}selectAll
#   arg0 - SOAP::SOAPInt
class SelectAll    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}selectAllResponse
class SelectAllResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}addSelectionByName
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPString
class AddSelectionByName    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}addSelectionByNameResponse
class AddSelectionByNameResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}selectByName
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPString
class SelectByName    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}selectByNameResponse
class SelectByNameResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSelectedItem
#   arg0 - SOAP::SOAPInt
class GetSelectedItem    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSelectedItemResponse
#   m_return - SOAP::SOAPString
class GetSelectedItemResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getEndpoint
class GetEndpoint  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}getEndpointResponse
#   m_return - SOAP::SOAPString
class GetEndpointResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}addSelectionByIndex
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPInt
class AddSelectionByIndex    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}addSelectionByIndexResponse
class AddSelectionByIndexResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}getItemsCount
#   arg0 - SOAP::SOAPInt
class GetItemsCount    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getItemsCountResponse
#   m_return - SOAP::SOAPInt
class GetItemsCountResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}removeSelectionByName
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPString
class RemoveSelectionByName    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}removeSelectionByNameResponse
class RemoveSelectionByNameResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}deselectAll
#   arg0 - SOAP::SOAPInt
class DeselectAll    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}deselectAllResponse
class DeselectAllResponse  
    def initialize
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSelectedItems
#   arg0 - SOAP::SOAPInt
class GetSelectedItems    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSelectedItemsResponse
class GetSelectedItemsResponse < ::Array
end
# {http:controls.classes.win32.server.sirius.org/}getSelectedIndex
#   arg0 - SOAP::SOAPInt
class GetSelectedIndex    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSelectedIndexResponse
#   m_return - SOAP::SOAPInt
class GetSelectedIndexResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}removeSelectionByIndex
#   arg0 - SOAP::SOAPInt
#   arg1 - SOAP::SOAPInt
class RemoveSelectionByIndex    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}removeSelectionByIndexResponse
class RemoveSelectionByIndexResponse  
    def initialize
  end
end

end; end; end; end; end
