require 'sirius/win32/core/button/ButtonServiceDriver.rb'
require 'sirius/win32/core/combobox/ComboBoxServiceDriver.rb'
require 'sirius/win32/core/dialog/DialogServiceDriver.rb'
require 'sirius/win32/core/edit/EditServiceDriver.rb'
require 'sirius/win32/core/listbox/ListBoxServiceDriver.rb'
require 'sirius/win32/core/menu/MenuServiceDriver.rb'
require 'sirius/win32/core/tabcontrol/TabControlServiceDriver.rb'
require 'sirius/win32/core/utils/Win32UtilsServiceDriver.rb'
require 'sirius/win32/core/window/WindowServiceDriver.rb'
require 'sirius/win32/core/spin/SpinServiceDriver.rb'
require 'sirius/win32/core/slider/SliderServiceDriver.rb'

module Sirius
  module Client
    module Win32
      module Core
        class Core
          attr_accessor :button
          attr_accessor :dialog
          attr_accessor :edit
          attr_accessor :listbox
          attr_accessor :menu
          attr_accessor :tabcontrol
          attr_accessor :spin
          attr_accessor :slider
          attr_accessor :window

          def initialize(host = 'localhost', port = '21212')
            @button = Button::Button.new("http://#{host}:#{port}/win32/button")
            @dialog = Dialog::Dialog.new("http://#{host}:#{port}/win32/dialog")
            @edit = Edit::Edit.new("http://#{host}:#{port}/win32/edit")
            @listbox =
              Listbox::ListBox.new(
                "http://#{host}:#{port}/win32/listbox")
            @menu = Menu::Menu.new("http://#{host}:#{port}/win32/menu")
            @tabcontrol =
              Tabcontrol::TabControl.new(
                "http://#{host}:#{port}/win32/tabcontrol")
            @spin =
              Spin::Spin.new(
                "http://#{host}:#{port}/win32/spin")
            @slider =
              Slider::Slider.new(
                "http://#{host}:#{port}/win32/slider")
            @window = Window::Window.new("http://#{host}:#{port}/win32/window")
          end
        end
      end
    end
  end
end