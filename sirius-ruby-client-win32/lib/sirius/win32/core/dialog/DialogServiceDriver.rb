require 'DialogService.rb'
require 'DialogServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Win32::Core::Dialog


class Dialog < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/dialog"
  Methods = [
    [ "",
      "getDlgCtrlID",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgCtrlID"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgCtrlIDResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getDlgItem",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgItem"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgItemResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getDialogBaseUnits",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDialogBaseUnits"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDialogBaseUnitsResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getDlgItemInt",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgItemInt"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgItemIntResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getDlgItemTextA",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgItemTextA"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "getDlgItemTextAResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "isDlgButtonChecked",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isDlgButtonChecked"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "isDlgButtonCheckedResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setDlgItemInt",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "setDlgItemInt"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "setDlgItemIntResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setDlgItemText",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "setDlgItemText"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:classes.win32.server.sirius.org/", "setDlgItemTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = DialogServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = DialogServiceMappingRegistry::LiteralRegistry
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
