require 'sirius/win32/core/combobox/ComboBoxService.rb'
require 'sirius/win32/core/combobox/ComboBoxServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Combobox


class ComboBox < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http:localhost:21212/win32/combobox"
  Methods = [
    [ "",
      "getCount",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetCount"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getItemData",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetItemData"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetItemDataResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getLBTextLen",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLBTextLen"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLBTextLenResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "findString",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "FindString"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "FindStringResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "showDropdown",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ShowDropdown"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ShowDropdownResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setText",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetText"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setEditSel",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetEditSel"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetEditSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getEditSel",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetEditSel"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetEditSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getLBText",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLBText"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLBTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getCurSel",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetCurSel"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetCurSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getText",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetText"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "resetContent",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ResetContent"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ResetContentResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectString",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SelectString"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SelectStringResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "findItemData",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "FindItemData"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "FindItemDataResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setCurSel",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetCurSel"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetCurSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getTextLength",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetTextLength"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetTextLengthResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setItemHeight",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetItemHeight"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetItemHeightResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getDroppedState",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetDroppedState"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetDroppedStateResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getItemHeight",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetItemHeight"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetItemHeightResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "findStringExact",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "FindStringExact"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "FindStringExactResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getExtendedUI",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetExtendedUI"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetExtendedUIResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = ComboBoxServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = ComboBoxServiceMappingRegistry::LiteralRegistry
    init_methods
  end
private

    def init_methods
      Methods.each do |definitions|
              opt = definitions.last
              if opt[:request_style] == :document
                add_document_operation(*definitions)
              else
                add_rpc_operation(*definitions)
                qname = definitions[0]
                name = definitions[2]
                if qname.name != name and qname.name.capitalize == name.capitalize
                  ::SOAP::Mapping.define_singleton_method(self, qname.name) do |*arg|
                    __send__(name, *arg)
                  end
                end
              end
            end

  end
end

end
