require 'sirius/internal/InternalService.rb'
require 'soap/mapping'

module Sirius  module Client    module Internal
      module InternalServiceMappingRegistry
        EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
        LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
        NsServerSiriusOrg = "http://server.sirius.org/"
        EncodedRegistry.register(
        :class => Sirius::Client::Internal::Stop,
        :schema_type => XSD::QName.new(NsServerSiriusOrg, "stop"),
        :schema_element => []
        )

        EncodedRegistry.register(
        :class => Sirius::Client::Internal::StopResponse,
        :schema_type => XSD::QName.new(NsServerSiriusOrg, "stopResponse"),
        :schema_element => []
        )

        LiteralRegistry.register(
        :class => Sirius::Client::Internal::Stop,
        :schema_type => XSD::QName.new(NsServerSiriusOrg, "stop"),
        :schema_element => []
        )

        LiteralRegistry.register(
        :class => Sirius::Client::Internal::StopResponse,
        :schema_type => XSD::QName.new(NsServerSiriusOrg, "stopResponse"),
        :schema_element => []
        )

        LiteralRegistry.register(
        :class => Sirius::Client::Internal::Stop,
        :schema_name => XSD::QName.new(NsServerSiriusOrg, "stop"),
        :schema_element => []
        )

        LiteralRegistry.register(
        :class => Sirius::Client::Internal::StopResponse,
        :schema_name => XSD::QName.new(NsServerSiriusOrg, "stopResponse"),
        :schema_element => []
        )
      end

    end
  end
end