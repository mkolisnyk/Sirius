require 'ListBoxService.rb'
require 'ListBoxServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Listbox


class ListBox < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/listbox"
  Methods = [
    [ "",
      "addSelectionByIndex",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "addSelectionByIndex"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "addSelectionByIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "addSelectionByName",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "addSelectionByName"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "addSelectionByNameResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getItemsCount",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getItemsCount"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getItemsCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSelectedItems",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSelectedItems"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSelectedItemsResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectByIndex",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "selectByIndex"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "selectByIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getEndpoint",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getEndpoint"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getEndpointResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "removeSelectionByIndex",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "removeSelectionByIndex"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "removeSelectionByIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "removeSelectionByName",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "removeSelectionByName"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "removeSelectionByNameResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "deselectAll",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "deselectAll"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "deselectAllResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getItemNames",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getItemNames"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getItemNamesResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectByName",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "selectByName"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "selectByNameResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "equals",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "equals"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "equalsResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "selectAll",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "selectAll"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "selectAllResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSelectedIndex",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSelectedIndex"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSelectedIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSelectedItem",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSelectedItem"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "getSelectedItemResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = ListBoxServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = ListBoxServiceMappingRegistry::LiteralRegistry
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
