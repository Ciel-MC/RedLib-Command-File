package com.github.shuaiouke.redlibcommandfile.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class RedLibCommandColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("TAG", RedLibCommandSyntaxHighlighter.TAG),
            new AttributesDescriptor("COMMAND_NAME", RedLibCommandSyntaxHighlighter.COMMAND_NAME),
            new AttributesDescriptor("ARG_NAME", RedLibCommandSyntaxHighlighter.ARG_NAME),
            new AttributesDescriptor("ARG_TYPE", RedLibCommandSyntaxHighlighter.ARG_TYPE),
    };

    @Override
    public @Nullable Icon getIcon() {
        return RedLibCommandIcon.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new RedLibCommandSyntaxHighlighter();
    }

    @Override
    public @NotNull String getDemoText() {
        return "\n" +
                "structure,struct {\n" +
                "\thelp The structure base command\n" +
                "\tpermission redlib.dev\n" +
                "\ttool,wand {\n" +
                "\t\tuser player\n" +
                "\t\thelp Get a structure dev tool\n" +
                "\t\thook wand\n" +
                "\t}\n" +
                "\tcreate string:name* {\n" +
                "\t\thelp Register a structure from the selected points for testing\n" +
                "\t\thook create\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\tbuild int:rotation?(0) boolean:mirrored?(true) {\n" +
                "\t\thelp Build the created structure at your location\n" +
                "\t\thook build\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\texport string:filename*?(structure) {\n" +
                "\t\thelp Exports the structure data for the selected points to a file\n" +
                "\t\thook export\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\tskip material:type? {\n" +
                "\t\thelp Sets a block type to skip when scanning, in case you want to use it for the corners\n" +
                "\t\thook skip\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "}\n" +
                "profiler,rprofiler {\n" +
                "\tpermission redlib.dev\n" +
                "\tmonitor {\n" +
                "\t\tstart {\n" +
                "\t\t\thelp Starts the tick monitor profiler\n" +
                "\t\t\thook startmonitor\n" +
                "\t\t}\n" +
                "\t\tsetminimum int:minimum {\n" +
                "\t\t\thelp Sets the minimum milliseconds for a tick to take to be reported\n" +
                "\t\t\thook setminimum\n" +
                "\t\t}\n" +
                "\t\tclear {\n" +
                "\t\t\thelp Clears the tick monitor profiler reports\n" +
                "\t\t\thook clear\n" +
                "\t\t}\n" +
                "\t\treports {\n" +
                "\t\t\thelp Shows reports for the longest ticks since the tick monitor profiler started\n" +
                "\t\t\thook reports\n" +
                "\t\t\tuser player\n" +
                "\t\t}\n" +
                "\t\tselect int:num {\n" +
                "\t\t\tnotab\n" +
                "\t\t\thook selectreport\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tstart {\n" +
                "\t\thelp Starts or resets the RedLib passive profiler\n" +
                "\t\thook start\n" +
                "\t}\n" +
                "\tstop {\n" +
                "\t\thelp Stops the RedLib passive profiler\n" +
                "\t\thook stop\n" +
                "\t}\n" +
                "\tsummary {\n" +
                "\t\thelp Creates and selects a summary from the manual RedLib profiler\n" +
                "\t\thook summary\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\tverbose {\n" +
                "\t\thelp Toggle verbose mode\n" +
                "\t\thook verbose\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\ttimeformat {\n" +
                "\t\thelp Toggle time between percentages and milliseconds\n" +
                "\t\thook timeformat\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\troot {\n" +
                "\t\thelp Shows the root method from the selected summary\n" +
                "\t\thook root\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\tselect string:selector {\n" +
                "\t\thook select\n" +
                "\t\tuser player\n" +
                "\t\tnotab\n" +
                "\t}\n" +
                "\tup int:count?(1) {\n" +
                "\t\thelp Selects the parent method of the currently selected method\n" +
                "\t\thook up\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\tcollapse {\n" +
                "\t\thelp Collapses all methods\n" +
                "\t\thook collapse\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\ttoggleexpand string:selector {\n" +
                "\t\thook toggleexpand\n" +
                "\t\tuser player\n" +
                "\t\tnotab\n" +
                "\t}\n" +
                "\tsearch int:--depth(0) double:--over-percent(0) int:--over-milliseconds(0) string:term {\n" +
                "\t\thelp Searches the profiler with the given conditions\n" +
                "\t\thook search\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "\tlimit int:amount {\n" +
                "\t\thelp Limits the number of children that can be shown under a single method\n" +
                "\t\thook limit\n" +
                "\t\tuser player\n" +
                "\t}\n" +
                "}\n" +
                "commandchain,cchain commandchain...:commandchain {\n" +
                "\thelp Runs several commands in a row separated by ;\n" +
                "\thook commandchain\n" +
                "\tpermission redlib.commandchain\n" +
                "}";
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull @NlsContexts.ConfigurableName String getDisplayName() {
        return "RedLib Command File";
    }
}
