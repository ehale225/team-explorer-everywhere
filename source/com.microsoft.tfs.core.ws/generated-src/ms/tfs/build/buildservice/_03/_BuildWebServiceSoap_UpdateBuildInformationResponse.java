// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildInformationNode;
import ms.tfs.build.buildservice._03._BuildWebServiceSoap_UpdateBuildInformationResponse;
import ms.tfs.build.buildservice._03._InformationField;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildWebServiceSoap_UpdateBuildInformationResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildInformationNode[] updateBuildInformationResult;

    public _BuildWebServiceSoap_UpdateBuildInformationResponse()
    {
        super();
    }

    public _BuildWebServiceSoap_UpdateBuildInformationResponse(
        final _BuildInformationNode[] updateBuildInformationResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUpdateBuildInformationResult(updateBuildInformationResult);
    }

    public _BuildInformationNode[] getUpdateBuildInformationResult()
    {
        return this.updateBuildInformationResult;
    }

    public void setUpdateBuildInformationResult(_BuildInformationNode[] value)
    {
        this.updateBuildInformationResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("UpdateBuildInformationResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _BuildInformationNode complexObject0 = new _BuildInformationNode();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.updateBuildInformationResult = (_BuildInformationNode[]) list0.toArray(
                                new _BuildInformationNode[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
