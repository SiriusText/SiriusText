package org.obeonetwork.sirius.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.obeonetwork.sirius.text.services.SiriusTextDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSiriusTextDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOCUMENTATION", "RULE_ID", "RULE_STRING", "RULE_EXPRESSION", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'.'", "'.*'", "'import'", "'designer'", "'as'", "'{'", "'}'", "'@IconPath('", "')'", "'viewpoint'", "'modelFileExtensions'", "'='", "'['", "','", "']'", "'representations'", "'javaExtensions'", "'@Initialized'", "'@ShowOnStartup'", "'@EnablePopupBars'", "'@MetamodelUris'", "'({'", "'})'", "'diagram'", "'for'", "'?'", "'documentation'", "'titleExpression'", "'rootExpression'", "'defaultLayer'", "'additionalLayers'", "'layer'", "'mappings'", "'edges'", "'sections'", "'section'", "'tools'", "'@ForceRefresh'", "'@NodeCreationVariable'", "'('", "'@ContainerViewVariable'", "'containerCreation'", "'containerMappings'", "'extraMappings'", "'begin'", "'changeContext'", "':'", "'if'", "'set'", "'featureName'", "'valueExpression'", "'unset'", "'elementExpression'", "'createInstance'", "'referenceName'", "'type'", "'createView'", "'mapping'", "'containerViewExpression'", "'createEdgeView'", "'sourceExpression'", "'targetExpression'", "'deleteView'", "'()'", "'remove'", "'move'", "'newContainerExpression'", "'switch'", "'case'", "'default'", "'node'", "'style'", "'semanticCandidatesExpression'", "'associatedElementsExpression'", "'container'", "'@AllowVerticalResizing'", "'@AllowHorizontalResizing'", "'square'", "'in'", "'labelBorderStyle'", "'height'", "'width'", "'sizeComputationExpression'", "'tooltipExpression'", "'@ShowIcon'", "'@HideByDefault'", "'label'", "'size'", "'border'", "'gradient'", "'from'", "'to'", "'heightComputationExpression'", "'widthComputationExpression'", "'arcHeight'", "'arcWidth'", "'relationBasedEdge'", "'sourceMappings'", "'targetMappings'", "'targetFinderExpression'", "'edgeStyle'", "'line'", "'routing'", "'sourceArrow'", "'targetArrow'", "'foldingStyle'", "'endsCentering'", "'palette'", "'color'", "'rgb'", "'freeForm'", "'list'", "'horizontalStack'", "'verticalStack'", "'bold'", "'italic'", "'underline'", "'strikethrought'", "'left'", "'center'", "'right'", "'labelBorderStyleWithBeveledCorner'", "'labelBorderForContainer'", "'noLabelBorderForList'", "'oblique'", "'lefttoright'", "'toptobottom'", "'solid'", "'dash'", "'dot'", "'dash_dot'", "'straight'", "'manhattan'", "'tree'", "'NoDecoration'", "'OutputArrow'", "'InputArrow'", "'OutputClosedArrow'", "'InputClosedArrow'", "'OutputFillClosedArrow'", "'InputFillClosedArrow'", "'Diamond'", "'FillDiamond'", "'InputArrowWithDiamond'", "'InputArrowWithFillDiamond'", "'none'", "'source'", "'target'", "'both'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DOCUMENTATION=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_EXPRESSION=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalSiriusTextDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSiriusTextDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSiriusTextDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSiriusTextDsl.g"; }



     	private SiriusTextDslGrammarAccess grammarAccess;
     	
        public InternalSiriusTextDslParser(TokenStream input, SiriusTextDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SiriusFile";	
       	}
       	
       	@Override
       	protected SiriusTextDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSiriusFile"
    // InternalSiriusTextDsl.g:68:1: entryRuleSiriusFile returns [EObject current=null] : iv_ruleSiriusFile= ruleSiriusFile EOF ;
    public final EObject entryRuleSiriusFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFile = null;


        try {
            // InternalSiriusTextDsl.g:69:2: (iv_ruleSiriusFile= ruleSiriusFile EOF )
            // InternalSiriusTextDsl.g:70:2: iv_ruleSiriusFile= ruleSiriusFile EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFile=ruleSiriusFile();

            state._fsp--;

             current =iv_ruleSiriusFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFile"


    // $ANTLR start "ruleSiriusFile"
    // InternalSiriusTextDsl.g:77:1: ruleSiriusFile returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) ;
    public final EObject ruleSiriusFile() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:80:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) ) )
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            {
            // InternalSiriusTextDsl.g:81:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) ) )
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_body_4_0= ruleSiriusFileBody ) )
            {
            // InternalSiriusTextDsl.g:81:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOCUMENTATION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:82:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:83:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_3); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSiriusFileAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSiriusFileRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getSiriusFileAccess().getPackageKeyword_1());
                
            // InternalSiriusTextDsl.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // InternalSiriusTextDsl.g:105:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:121:2: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalSiriusTextDsl.g:122:1: (lv_imports_3_0= ruleImport )
            	    // InternalSiriusTextDsl.g:123:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiriusFileAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSiriusTextDsl.g:139:3: ( (lv_body_4_0= ruleSiriusFileBody ) )
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            {
            // InternalSiriusTextDsl.g:140:1: (lv_body_4_0= ruleSiriusFileBody )
            // InternalSiriusTextDsl.g:141:3: lv_body_4_0= ruleSiriusFileBody
            {
             
            	        newCompositeNode(grammarAccess.getSiriusFileAccess().getBodySiriusFileBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleSiriusFileBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSiriusFileRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.SiriusFileBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFile"


    // $ANTLR start "entryRuleSiriusFileBody"
    // InternalSiriusTextDsl.g:165:1: entryRuleSiriusFileBody returns [EObject current=null] : iv_ruleSiriusFileBody= ruleSiriusFileBody EOF ;
    public final EObject entryRuleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiriusFileBody = null;


        try {
            // InternalSiriusTextDsl.g:166:2: (iv_ruleSiriusFileBody= ruleSiriusFileBody EOF )
            // InternalSiriusTextDsl.g:167:2: iv_ruleSiriusFileBody= ruleSiriusFileBody EOF
            {
             newCompositeNode(grammarAccess.getSiriusFileBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiriusFileBody=ruleSiriusFileBody();

            state._fsp--;

             current =iv_ruleSiriusFileBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiriusFileBody"


    // $ANTLR start "ruleSiriusFileBody"
    // InternalSiriusTextDsl.g:174:1: ruleSiriusFileBody returns [EObject current=null] : (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool ) ;
    public final EObject ruleSiriusFileBody() throws RecognitionException {
        EObject current = null;

        EObject this_Designer_0 = null;

        EObject this_Representation_1 = null;

        EObject this_Layer_2 = null;

        EObject this_Mapping_3 = null;

        EObject this_Style_4 = null;

        EObject this_Palette_5 = null;

        EObject this_Edge_6 = null;

        EObject this_Section_7 = null;

        EObject this_Tool_8 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:177:28: ( (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool ) )
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )
            {
            // InternalSiriusTextDsl.g:178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSiriusTextDsl.g:179:5: this_Designer_0= ruleDesigner
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getDesignerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Designer_0=ruleDesigner();

                    state._fsp--;

                     
                            current = this_Designer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:189:5: this_Representation_1= ruleRepresentation
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getRepresentationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Representation_1=ruleRepresentation();

                    state._fsp--;

                     
                            current = this_Representation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:199:5: this_Layer_2= ruleLayer
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getLayerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Layer_2=ruleLayer();

                    state._fsp--;

                     
                            current = this_Layer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:209:5: this_Mapping_3= ruleMapping
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getMappingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Mapping_3=ruleMapping();

                    state._fsp--;

                     
                            current = this_Mapping_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:219:5: this_Style_4= ruleStyle
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getStyleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Style_4=ruleStyle();

                    state._fsp--;

                     
                            current = this_Style_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:229:5: this_Palette_5= rulePalette
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getPaletteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Palette_5=rulePalette();

                    state._fsp--;

                     
                            current = this_Palette_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:239:5: this_Edge_6= ruleEdge
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getEdgeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Edge_6=ruleEdge();

                    state._fsp--;

                     
                            current = this_Edge_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:249:5: this_Section_7= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getSectionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Section_7=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:259:5: this_Tool_8= ruleTool
                    {
                     
                            newCompositeNode(grammarAccess.getSiriusFileBodyAccess().getToolParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Tool_8=ruleTool();

                    state._fsp--;

                     
                            current = this_Tool_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiriusFileBody"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSiriusTextDsl.g:275:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSiriusTextDsl.g:276:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSiriusTextDsl.g:277:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSiriusTextDsl.g:284:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:287:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSiriusTextDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSiriusTextDsl.g:288:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSiriusTextDsl.g:288:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSiriusTextDsl.g:295:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:296:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_4); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:316:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSiriusTextDsl.g:317:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSiriusTextDsl.g:318:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSiriusTextDsl.g:325:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:328:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSiriusTextDsl.g:329:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSiriusTextDsl.g:329:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSiriusTextDsl.g:330:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalSiriusTextDsl.g:340:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSiriusTextDsl.g:341:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalSiriusTextDsl.g:354:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSiriusTextDsl.g:355:2: (iv_ruleImport= ruleImport EOF )
            // InternalSiriusTextDsl.g:356:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSiriusTextDsl.g:363:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:366:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSiriusTextDsl.g:367:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSiriusTextDsl.g:367:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSiriusTextDsl.g:367:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // InternalSiriusTextDsl.g:371:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSiriusTextDsl.g:372:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSiriusTextDsl.g:372:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalSiriusTextDsl.g:373:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.QualifiedNameWithWildcard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDesigner"
    // InternalSiriusTextDsl.g:397:1: entryRuleDesigner returns [EObject current=null] : iv_ruleDesigner= ruleDesigner EOF ;
    public final EObject entryRuleDesigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesigner = null;


        try {
            // InternalSiriusTextDsl.g:398:2: (iv_ruleDesigner= ruleDesigner EOF )
            // InternalSiriusTextDsl.g:399:2: iv_ruleDesigner= ruleDesigner EOF
            {
             newCompositeNode(grammarAccess.getDesignerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesigner=ruleDesigner();

            state._fsp--;

             current =iv_ruleDesigner; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesigner"


    // $ANTLR start "ruleDesigner"
    // InternalSiriusTextDsl.g:406:1: ruleDesigner returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) ;
    public final EObject ruleDesigner() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_viewpoints_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:409:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' ) )
            // InternalSiriusTextDsl.g:410:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            {
            // InternalSiriusTextDsl.g:410:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}' )
            // InternalSiriusTextDsl.g:410:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'designer' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_viewpoints_6_0= ruleViewpoint ) )* otherlv_7= '}'
            {
            // InternalSiriusTextDsl.g:410:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOCUMENTATION) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSiriusTextDsl.g:411:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:411:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:412:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_8); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDesignerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getDesignerAccess().getDesignerKeyword_1());
                
            // InternalSiriusTextDsl.g:432:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:433:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:433:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:434:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDesignerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDesignerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:450:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSiriusTextDsl.g:450:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getDesignerAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:454:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:455:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:455:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:456:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getDesignerAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDesignerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

                	newLeafNode(otherlv_5, grammarAccess.getDesignerAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:476:1: ( (lv_viewpoints_6_0= ruleViewpoint ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOCUMENTATION||LA8_0==19||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:477:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    {
            	    // InternalSiriusTextDsl.g:477:1: (lv_viewpoints_6_0= ruleViewpoint )
            	    // InternalSiriusTextDsl.g:478:3: lv_viewpoints_6_0= ruleViewpoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDesignerAccess().getViewpointsViewpointParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_12);
            	    lv_viewpoints_6_0=ruleViewpoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDesignerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"viewpoints",
            	            		lv_viewpoints_6_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Viewpoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getDesignerAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesigner"


    // $ANTLR start "entryRuleViewpoint"
    // InternalSiriusTextDsl.g:506:1: entryRuleViewpoint returns [EObject current=null] : iv_ruleViewpoint= ruleViewpoint EOF ;
    public final EObject entryRuleViewpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewpoint = null;


        try {
            // InternalSiriusTextDsl.g:507:2: (iv_ruleViewpoint= ruleViewpoint EOF )
            // InternalSiriusTextDsl.g:508:2: iv_ruleViewpoint= ruleViewpoint EOF
            {
             newCompositeNode(grammarAccess.getViewpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewpoint=ruleViewpoint();

            state._fsp--;

             current =iv_ruleViewpoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewpoint"


    // $ANTLR start "ruleViewpoint"
    // InternalSiriusTextDsl.g:515:1: ruleViewpoint returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'viewpoint' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'modelFileExtensions' otherlv_10= '=' otherlv_11= '[' ( (lv_modelFileExtensions_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )* otherlv_15= ']' )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' ) ;
    public final EObject ruleViewpoint() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_iconPath_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_modelFileExtensions_12_0=null;
        Token otherlv_13=null;
        Token lv_modelFileExtensions_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:518:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'viewpoint' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'modelFileExtensions' otherlv_10= '=' otherlv_11= '[' ( (lv_modelFileExtensions_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )* otherlv_15= ']' )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' ) )
            // InternalSiriusTextDsl.g:519:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'viewpoint' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'modelFileExtensions' otherlv_10= '=' otherlv_11= '[' ( (lv_modelFileExtensions_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )* otherlv_15= ']' )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' )
            {
            // InternalSiriusTextDsl.g:519:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'viewpoint' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'modelFileExtensions' otherlv_10= '=' otherlv_11= '[' ( (lv_modelFileExtensions_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )* otherlv_15= ']' )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}' )
            // InternalSiriusTextDsl.g:519:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'viewpoint' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'modelFileExtensions' otherlv_10= '=' otherlv_11= '[' ( (lv_modelFileExtensions_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )* otherlv_15= ']' )? (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )? (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )? otherlv_30= '}'
            {
            // InternalSiriusTextDsl.g:519:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOCUMENTATION) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSiriusTextDsl.g:520:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:520:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:521:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_13); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getViewpointAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:537:3: (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSiriusTextDsl.g:537:5: otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_10); 

                        	newLeafNode(otherlv_1, grammarAccess.getViewpointAccess().getIconPathKeyword_1_0());
                        
                    // InternalSiriusTextDsl.g:541:1: ( (lv_iconPath_2_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:542:1: (lv_iconPath_2_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:542:1: (lv_iconPath_2_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:543:3: lv_iconPath_2_0= RULE_STRING
                    {
                    lv_iconPath_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_iconPath_2_0, grammarAccess.getViewpointAccess().getIconPathSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"iconPath",
                            		lv_iconPath_2_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                        	newLeafNode(otherlv_3, grammarAccess.getViewpointAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getViewpointAccess().getViewpointKeyword_2());
                
            // InternalSiriusTextDsl.g:567:1: ( (lv_name_5_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:568:1: (lv_name_5_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:568:1: (lv_name_5_0= RULE_ID )
            // InternalSiriusTextDsl.g:569:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_5_0, grammarAccess.getViewpointAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewpointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:585:2: (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSiriusTextDsl.g:585:4: otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_6, grammarAccess.getViewpointAccess().getAsKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:589:1: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:590:1: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:590:1: (lv_label_7_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:591:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_7_0, grammarAccess.getViewpointAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_7_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_16); 

                	newLeafNode(otherlv_8, grammarAccess.getViewpointAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalSiriusTextDsl.g:611:1: (otherlv_9= 'modelFileExtensions' otherlv_10= '=' otherlv_11= '[' ( (lv_modelFileExtensions_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )* otherlv_15= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSiriusTextDsl.g:611:3: otherlv_9= 'modelFileExtensions' otherlv_10= '=' otherlv_11= '[' ( (lv_modelFileExtensions_12_0= RULE_STRING ) ) (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )* otherlv_15= ']'
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_17); 

                        	newLeafNode(otherlv_9, grammarAccess.getViewpointAccess().getModelFileExtensionsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_10, grammarAccess.getViewpointAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_11=(Token)match(input,24,FOLLOW_10); 

                        	newLeafNode(otherlv_11, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_6_2());
                        
                    // InternalSiriusTextDsl.g:623:1: ( (lv_modelFileExtensions_12_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:624:1: (lv_modelFileExtensions_12_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:624:1: (lv_modelFileExtensions_12_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:625:3: lv_modelFileExtensions_12_0= RULE_STRING
                    {
                    lv_modelFileExtensions_12_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    			newLeafNode(lv_modelFileExtensions_12_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_6_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"modelFileExtensions",
                            		lv_modelFileExtensions_12_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:641:2: (otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==25) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:641:4: otherlv_13= ',' ( (lv_modelFileExtensions_14_0= RULE_STRING ) )
                    	    {
                    	    otherlv_13=(Token)match(input,25,FOLLOW_10); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getViewpointAccess().getCommaKeyword_6_4_0());
                    	        
                    	    // InternalSiriusTextDsl.g:645:1: ( (lv_modelFileExtensions_14_0= RULE_STRING ) )
                    	    // InternalSiriusTextDsl.g:646:1: (lv_modelFileExtensions_14_0= RULE_STRING )
                    	    {
                    	    // InternalSiriusTextDsl.g:646:1: (lv_modelFileExtensions_14_0= RULE_STRING )
                    	    // InternalSiriusTextDsl.g:647:3: lv_modelFileExtensions_14_0= RULE_STRING
                    	    {
                    	    lv_modelFileExtensions_14_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    			newLeafNode(lv_modelFileExtensions_14_0, grammarAccess.getViewpointAccess().getModelFileExtensionsSTRINGTerminalRuleCall_6_4_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getViewpointRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"modelFileExtensions",
                    	            		lv_modelFileExtensions_14_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FOLLOW_20); 

                        	newLeafNode(otherlv_15, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_6_5());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:667:3: (otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSiriusTextDsl.g:667:5: otherlv_16= 'representations' otherlv_17= '=' otherlv_18= '[' ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_22= ']'
                    {
                    otherlv_16=(Token)match(input,27,FOLLOW_17); 

                        	newLeafNode(otherlv_16, grammarAccess.getViewpointAccess().getRepresentationsKeyword_7_0());
                        
                    otherlv_17=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_17, grammarAccess.getViewpointAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_18=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_18, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:679:1: ( ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalSiriusTextDsl.g:679:2: ( ( ruleQualifiedName ) ) (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:679:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:680:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:680:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:681:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getViewpointRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:694:2: (otherlv_20= ',' ( ( ruleQualifiedName ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==25) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:694:4: otherlv_20= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_20=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_20, grammarAccess.getViewpointAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:698:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:699:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:699:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:700:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getViewpointRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getViewpointAccess().getRepresentationsRepresentationCrossReference_7_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,26,FOLLOW_22); 

                        	newLeafNode(otherlv_22, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:717:3: (otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSiriusTextDsl.g:717:5: otherlv_23= 'javaExtensions' otherlv_24= '=' otherlv_25= '[' ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_29= ']'
                    {
                    otherlv_23=(Token)match(input,28,FOLLOW_17); 

                        	newLeafNode(otherlv_23, grammarAccess.getViewpointAccess().getJavaExtensionsKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_24, grammarAccess.getViewpointAccess().getEqualsSignKeyword_8_1());
                        
                    otherlv_25=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_25, grammarAccess.getViewpointAccess().getLeftSquareBracketKeyword_8_2());
                        
                    // InternalSiriusTextDsl.g:729:1: ( ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalSiriusTextDsl.g:729:2: ( ( ruleQualifiedName ) ) (otherlv_27= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:729:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:730:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:730:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:731:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getViewpointRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getViewpointAccess().getJavaExtensionJvmTypeCrossReference_8_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:744:2: (otherlv_27= ',' ( ( ruleQualifiedName ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==25) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:744:4: otherlv_27= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_27=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_27, grammarAccess.getViewpointAccess().getCommaKeyword_8_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:748:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:749:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:749:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:750:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getViewpointRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getViewpointAccess().getJavaExtensionJvmTypeCrossReference_8_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,26,FOLLOW_23); 

                        	newLeafNode(otherlv_29, grammarAccess.getViewpointAccess().getRightSquareBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_30, grammarAccess.getViewpointAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewpoint"


    // $ANTLR start "entryRuleRepresentation"
    // InternalSiriusTextDsl.g:779:1: entryRuleRepresentation returns [EObject current=null] : iv_ruleRepresentation= ruleRepresentation EOF ;
    public final EObject entryRuleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepresentation = null;


        try {
            // InternalSiriusTextDsl.g:780:2: (iv_ruleRepresentation= ruleRepresentation EOF )
            // InternalSiriusTextDsl.g:781:2: iv_ruleRepresentation= ruleRepresentation EOF
            {
             newCompositeNode(grammarAccess.getRepresentationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepresentation=ruleRepresentation();

            state._fsp--;

             current =iv_ruleRepresentation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepresentation"


    // $ANTLR start "ruleRepresentation"
    // InternalSiriusTextDsl.g:788:1: ruleRepresentation returns [EObject current=null] : this_Diagram_0= ruleDiagram ;
    public final EObject ruleRepresentation() throws RecognitionException {
        EObject current = null;

        EObject this_Diagram_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:791:28: (this_Diagram_0= ruleDiagram )
            // InternalSiriusTextDsl.g:793:5: this_Diagram_0= ruleDiagram
            {
             
                    newCompositeNode(grammarAccess.getRepresentationAccess().getDiagramParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Diagram_0=ruleDiagram();

            state._fsp--;

             
                    current = this_Diagram_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepresentation"


    // $ANTLR start "entryRuleDiagram"
    // InternalSiriusTextDsl.g:809:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // InternalSiriusTextDsl.g:810:2: (iv_ruleDiagram= ruleDiagram EOF )
            // InternalSiriusTextDsl.g:811:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // InternalSiriusTextDsl.g:818:1: ruleDiagram returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? ( (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' )? otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_initialized_1_0=null;
        Token lv_showOnStartup_2_0=null;
        Token lv_enablePopupBars_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_metamodelUris_6_0=null;
        Token otherlv_7=null;
        Token lv_metamodelUris_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token lv_label_13_0=null;
        Token otherlv_14=null;
        Token lv_domainClass_15_0=null;
        Token otherlv_16=null;
        Token lv_preconditionExpression_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_endUserDocumentation_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_titleExpression_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_rootExpression_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:821:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? ( (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' )? otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:822:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? ( (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' )? otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:822:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? ( (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' )? otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}' )
            // InternalSiriusTextDsl.g:822:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_initialized_1_0= '@Initialized' ) )? ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )? ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )? ( (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' )? otherlv_10= 'diagram' ( (lv_name_11_0= RULE_ID ) ) (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )? otherlv_14= 'for' ( (lv_domainClass_15_0= RULE_STRING ) ) (otherlv_16= '?' ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) ) )? otherlv_18= '{' (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )? (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )? (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )? (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )? (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )? otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:822:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOCUMENTATION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSiriusTextDsl.g:823:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:823:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:824:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_24); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getDiagramAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:840:3: ( (lv_initialized_1_0= '@Initialized' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSiriusTextDsl.g:841:1: (lv_initialized_1_0= '@Initialized' )
                    {
                    // InternalSiriusTextDsl.g:841:1: (lv_initialized_1_0= '@Initialized' )
                    // InternalSiriusTextDsl.g:842:3: lv_initialized_1_0= '@Initialized'
                    {
                    lv_initialized_1_0=(Token)match(input,29,FOLLOW_25); 

                            newLeafNode(lv_initialized_1_0, grammarAccess.getDiagramAccess().getInitializedInitializedKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "initialized", true, "@Initialized");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:855:3: ( (lv_showOnStartup_2_0= '@ShowOnStartup' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSiriusTextDsl.g:856:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    {
                    // InternalSiriusTextDsl.g:856:1: (lv_showOnStartup_2_0= '@ShowOnStartup' )
                    // InternalSiriusTextDsl.g:857:3: lv_showOnStartup_2_0= '@ShowOnStartup'
                    {
                    lv_showOnStartup_2_0=(Token)match(input,30,FOLLOW_26); 

                            newLeafNode(lv_showOnStartup_2_0, grammarAccess.getDiagramAccess().getShowOnStartupShowOnStartupKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "showOnStartup", true, "@ShowOnStartup");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:870:3: ( (lv_enablePopupBars_3_0= '@EnablePopupBars' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSiriusTextDsl.g:871:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    {
                    // InternalSiriusTextDsl.g:871:1: (lv_enablePopupBars_3_0= '@EnablePopupBars' )
                    // InternalSiriusTextDsl.g:872:3: lv_enablePopupBars_3_0= '@EnablePopupBars'
                    {
                    lv_enablePopupBars_3_0=(Token)match(input,31,FOLLOW_27); 

                            newLeafNode(lv_enablePopupBars_3_0, grammarAccess.getDiagramAccess().getEnablePopupBarsEnablePopupBarsKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(current, "enablePopupBars", true, "@EnablePopupBars");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:885:3: ( (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSiriusTextDsl.g:885:4: (otherlv_4= '@MetamodelUris' )+ otherlv_5= '({' ( (lv_metamodelUris_6_0= RULE_STRING ) ) (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )* otherlv_9= '})'
                    {
                    // InternalSiriusTextDsl.g:885:4: (otherlv_4= '@MetamodelUris' )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==32) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:885:6: otherlv_4= '@MetamodelUris'
                    	    {
                    	    otherlv_4=(Token)match(input,32,FOLLOW_28); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getMetamodelUrisKeyword_4_0());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_10); 

                        	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getLeftParenthesisLeftCurlyBracketKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:893:1: ( (lv_metamodelUris_6_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:894:1: (lv_metamodelUris_6_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:894:1: (lv_metamodelUris_6_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:895:3: lv_metamodelUris_6_0= RULE_STRING
                    {
                    lv_metamodelUris_6_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    			newLeafNode(lv_metamodelUris_6_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"metamodelUris",
                            		lv_metamodelUris_6_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:911:2: (otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==25) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:911:4: otherlv_7= ',' ( (lv_metamodelUris_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,25,FOLLOW_10); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getDiagramAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // InternalSiriusTextDsl.g:915:1: ( (lv_metamodelUris_8_0= RULE_STRING ) )
                    	    // InternalSiriusTextDsl.g:916:1: (lv_metamodelUris_8_0= RULE_STRING )
                    	    {
                    	    // InternalSiriusTextDsl.g:916:1: (lv_metamodelUris_8_0= RULE_STRING )
                    	    // InternalSiriusTextDsl.g:917:3: lv_metamodelUris_8_0= RULE_STRING
                    	    {
                    	    lv_metamodelUris_8_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    	    			newLeafNode(lv_metamodelUris_8_0, grammarAccess.getDiagramAccess().getMetamodelUrisSTRINGTerminalRuleCall_4_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"metamodelUris",
                    	            		lv_metamodelUris_8_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,34,FOLLOW_30); 

                        	newLeafNode(otherlv_9, grammarAccess.getDiagramAccess().getRightCurlyBracketRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,35,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getDiagramAccess().getDiagramKeyword_5());
                
            // InternalSiriusTextDsl.g:941:1: ( (lv_name_11_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:942:1: (lv_name_11_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:942:1: (lv_name_11_0= RULE_ID )
            // InternalSiriusTextDsl.g:943:3: lv_name_11_0= RULE_ID
            {
            lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			newLeafNode(lv_name_11_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:959:2: (otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSiriusTextDsl.g:959:4: otherlv_12= 'as' ( (lv_label_13_0= RULE_STRING ) )
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_12, grammarAccess.getDiagramAccess().getAsKeyword_7_0());
                        
                    // InternalSiriusTextDsl.g:963:1: ( (lv_label_13_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:964:1: (lv_label_13_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:964:1: (lv_label_13_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:965:3: lv_label_13_0= RULE_STRING
                    {
                    lv_label_13_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    			newLeafNode(lv_label_13_0, grammarAccess.getDiagramAccess().getLabelSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,36,FOLLOW_10); 

                	newLeafNode(otherlv_14, grammarAccess.getDiagramAccess().getForKeyword_8());
                
            // InternalSiriusTextDsl.g:985:1: ( (lv_domainClass_15_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:986:1: (lv_domainClass_15_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:986:1: (lv_domainClass_15_0= RULE_STRING )
            // InternalSiriusTextDsl.g:987:3: lv_domainClass_15_0= RULE_STRING
            {
            lv_domainClass_15_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            			newLeafNode(lv_domainClass_15_0, grammarAccess.getDiagramAccess().getDomainClassSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_15_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1003:2: (otherlv_16= '?' ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSiriusTextDsl.g:1003:4: otherlv_16= '?' ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) )
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_34); 

                        	newLeafNode(otherlv_16, grammarAccess.getDiagramAccess().getQuestionMarkKeyword_10_0());
                        
                    // InternalSiriusTextDsl.g:1007:1: ( (lv_preconditionExpression_17_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1008:1: (lv_preconditionExpression_17_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1008:1: (lv_preconditionExpression_17_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1009:3: lv_preconditionExpression_17_0= RULE_EXPRESSION
                    {
                    lv_preconditionExpression_17_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_preconditionExpression_17_0, grammarAccess.getDiagramAccess().getPreconditionExpressionEXPRESSIONTerminalRuleCall_10_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preconditionExpression",
                            		lv_preconditionExpression_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_35); 

                	newLeafNode(otherlv_18, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_11());
                
            // InternalSiriusTextDsl.g:1029:1: (otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSiriusTextDsl.g:1029:3: otherlv_19= 'documentation' otherlv_20= '=' ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,38,FOLLOW_17); 

                        	newLeafNode(otherlv_19, grammarAccess.getDiagramAccess().getDocumentationKeyword_12_0());
                        
                    otherlv_20=(Token)match(input,23,FOLLOW_10); 

                        	newLeafNode(otherlv_20, grammarAccess.getDiagramAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:1037:1: ( (lv_endUserDocumentation_21_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1038:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1038:1: (lv_endUserDocumentation_21_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1039:3: lv_endUserDocumentation_21_0= RULE_STRING
                    {
                    lv_endUserDocumentation_21_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

                    			newLeafNode(lv_endUserDocumentation_21_0, grammarAccess.getDiagramAccess().getEndUserDocumentationSTRINGTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"endUserDocumentation",
                            		lv_endUserDocumentation_21_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1055:4: (otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSiriusTextDsl.g:1055:6: otherlv_22= 'titleExpression' otherlv_23= '=' ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    {
                    otherlv_22=(Token)match(input,39,FOLLOW_17); 

                        	newLeafNode(otherlv_22, grammarAccess.getDiagramAccess().getTitleExpressionKeyword_13_0());
                        
                    otherlv_23=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_23, grammarAccess.getDiagramAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalSiriusTextDsl.g:1063:1: ( (lv_titleExpression_24_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1064:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1064:1: (lv_titleExpression_24_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1065:3: lv_titleExpression_24_0= RULE_EXPRESSION
                    {
                    lv_titleExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_37); 

                    			newLeafNode(lv_titleExpression_24_0, grammarAccess.getDiagramAccess().getTitleExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"titleExpression",
                            		lv_titleExpression_24_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1081:4: (otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSiriusTextDsl.g:1081:6: otherlv_25= 'rootExpression' otherlv_26= '=' ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    {
                    otherlv_25=(Token)match(input,40,FOLLOW_17); 

                        	newLeafNode(otherlv_25, grammarAccess.getDiagramAccess().getRootExpressionKeyword_14_0());
                        
                    otherlv_26=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_26, grammarAccess.getDiagramAccess().getEqualsSignKeyword_14_1());
                        
                    // InternalSiriusTextDsl.g:1089:1: ( (lv_rootExpression_27_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1090:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1090:1: (lv_rootExpression_27_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1091:3: lv_rootExpression_27_0= RULE_EXPRESSION
                    {
                    lv_rootExpression_27_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_38); 

                    			newLeafNode(lv_rootExpression_27_0, grammarAccess.getDiagramAccess().getRootExpressionEXPRESSIONTerminalRuleCall_14_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rootExpression",
                            		lv_rootExpression_27_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1107:4: (otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSiriusTextDsl.g:1107:6: otherlv_28= 'defaultLayer' otherlv_29= '=' ( ( ruleQualifiedName ) )
                    {
                    otherlv_28=(Token)match(input,41,FOLLOW_17); 

                        	newLeafNode(otherlv_28, grammarAccess.getDiagramAccess().getDefaultLayerKeyword_15_0());
                        
                    otherlv_29=(Token)match(input,23,FOLLOW_4); 

                        	newLeafNode(otherlv_29, grammarAccess.getDiagramAccess().getEqualsSignKeyword_15_1());
                        
                    // InternalSiriusTextDsl.g:1115:1: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1116:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1116:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1117:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDiagramRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getDiagramAccess().getDefaultLayerLayerCrossReference_15_2_0()); 
                    	    
                    pushFollow(FOLLOW_39);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1130:4: (otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSiriusTextDsl.g:1130:6: otherlv_31= 'additionalLayers' otherlv_32= '=' otherlv_33= '[' ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_37= ']'
                    {
                    otherlv_31=(Token)match(input,42,FOLLOW_17); 

                        	newLeafNode(otherlv_31, grammarAccess.getDiagramAccess().getAdditionalLayersKeyword_16_0());
                        
                    otherlv_32=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_32, grammarAccess.getDiagramAccess().getEqualsSignKeyword_16_1());
                        
                    otherlv_33=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_33, grammarAccess.getDiagramAccess().getLeftSquareBracketKeyword_16_2());
                        
                    // InternalSiriusTextDsl.g:1142:1: ( ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1142:2: ( ( ruleQualifiedName ) ) (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1142:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1143:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1143:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1144:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getDiagramRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_16_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1157:2: (otherlv_35= ',' ( ( ruleQualifiedName ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==25) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1157:4: otherlv_35= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_35=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_35, grammarAccess.getDiagramAccess().getCommaKeyword_16_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1161:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1162:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1162:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1163:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getDiagramRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getAdditionalLayersLayerCrossReference_16_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_37=(Token)match(input,26,FOLLOW_23); 

                        	newLeafNode(otherlv_37, grammarAccess.getDiagramAccess().getRightSquareBracketKeyword_16_4());
                        

                    }
                    break;

            }

            otherlv_38=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_38, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleLayer"
    // InternalSiriusTextDsl.g:1192:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalSiriusTextDsl.g:1193:2: (iv_ruleLayer= ruleLayer EOF )
            // InternalSiriusTextDsl.g:1194:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalSiriusTextDsl.g:1201:1: ruleLayer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'layer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_iconPath_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1204:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'layer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' ) )
            // InternalSiriusTextDsl.g:1205:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'layer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' )
            {
            // InternalSiriusTextDsl.g:1205:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'layer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}' )
            // InternalSiriusTextDsl.g:1205:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'layer' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )? (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )? (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )? otherlv_28= '}'
            {
            // InternalSiriusTextDsl.g:1205:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_DOCUMENTATION) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSiriusTextDsl.g:1206:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1206:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1207:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_40); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getLayerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1223:3: (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSiriusTextDsl.g:1223:5: otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_10); 

                        	newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getIconPathKeyword_1_0());
                        
                    // InternalSiriusTextDsl.g:1227:1: ( (lv_iconPath_2_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1228:1: (lv_iconPath_2_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1228:1: (lv_iconPath_2_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1229:3: lv_iconPath_2_0= RULE_STRING
                    {
                    lv_iconPath_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_iconPath_2_0, grammarAccess.getLayerAccess().getIconPathSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLayerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"iconPath",
                            		lv_iconPath_2_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_41); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,43,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getLayerKeyword_2());
                
            // InternalSiriusTextDsl.g:1253:1: ( (lv_name_5_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1254:1: (lv_name_5_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1254:1: (lv_name_5_0= RULE_ID )
            // InternalSiriusTextDsl.g:1255:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_5_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLayerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_42); 

                	newLeafNode(otherlv_6, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:1275:1: (otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSiriusTextDsl.g:1275:3: otherlv_7= 'mappings' otherlv_8= '=' otherlv_9= '[' ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,44,FOLLOW_17); 

                        	newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getMappingsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayerAccess().getEqualsSignKeyword_5_1());
                        
                    otherlv_9=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_9, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:1287:1: ( ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1287:2: ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1287:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1288:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1288:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1289:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_5_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1302:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                            loop38:
                            do {
                                int alt38=2;
                                int LA38_0 = input.LA(1);

                                if ( (LA38_0==25) ) {
                                    alt38=1;
                                }


                                switch (alt38) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1302:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_11=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getLayerAccess().getCommaKeyword_5_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1306:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1307:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1307:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1308:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getMappingsMappingCrossReference_5_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop38;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_43); 

                        	newLeafNode(otherlv_13, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1325:3: (otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSiriusTextDsl.g:1325:5: otherlv_14= 'edges' otherlv_15= '=' otherlv_16= '[' ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_20= ']'
                    {
                    otherlv_14=(Token)match(input,45,FOLLOW_17); 

                        	newLeafNode(otherlv_14, grammarAccess.getLayerAccess().getEdgesKeyword_6_0());
                        
                    otherlv_15=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_15, grammarAccess.getLayerAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_16=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_16, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_6_2());
                        
                    // InternalSiriusTextDsl.g:1337:1: ( ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1337:2: ( ( ruleQualifiedName ) ) (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1337:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1338:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1338:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1339:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_6_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1352:2: (otherlv_18= ',' ( ( ruleQualifiedName ) ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==25) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1352:4: otherlv_18= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_18=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_18, grammarAccess.getLayerAccess().getCommaKeyword_6_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1356:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1357:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1357:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1358:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getEdgesEdgeCrossReference_6_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,26,FOLLOW_44); 

                        	newLeafNode(otherlv_20, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1375:3: (otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSiriusTextDsl.g:1375:5: otherlv_21= 'sections' otherlv_22= '=' otherlv_23= '[' ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_27= ']'
                    {
                    otherlv_21=(Token)match(input,46,FOLLOW_17); 

                        	newLeafNode(otherlv_21, grammarAccess.getLayerAccess().getSectionsKeyword_7_0());
                        
                    otherlv_22=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_22, grammarAccess.getLayerAccess().getEqualsSignKeyword_7_1());
                        
                    otherlv_23=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_23, grammarAccess.getLayerAccess().getLeftSquareBracketKeyword_7_2());
                        
                    // InternalSiriusTextDsl.g:1387:1: ( ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_ID) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1387:2: ( ( ruleQualifiedName ) ) (otherlv_25= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1387:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1388:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1388:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1389:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getLayerRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getLayerAccess().getSectionsSectionCrossReference_7_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1402:2: (otherlv_25= ',' ( ( ruleQualifiedName ) ) )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==25) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1402:4: otherlv_25= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_25=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_25, grammarAccess.getLayerAccess().getCommaKeyword_7_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1406:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1407:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1407:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1408:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getLayerRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getLayerAccess().getSectionsSectionCrossReference_7_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_27=(Token)match(input,26,FOLLOW_23); 

                        	newLeafNode(otherlv_27, grammarAccess.getLayerAccess().getRightSquareBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_28=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_28, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleSection"
    // InternalSiriusTextDsl.g:1437:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalSiriusTextDsl.g:1438:2: (iv_ruleSection= ruleSection EOF )
            // InternalSiriusTextDsl.g:1439:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalSiriusTextDsl.g:1446:1: ruleSection returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'section' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_iconPath_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1449:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'section' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' ) )
            // InternalSiriusTextDsl.g:1450:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'section' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' )
            {
            // InternalSiriusTextDsl.g:1450:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'section' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}' )
            // InternalSiriusTextDsl.g:1450:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'section' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )? otherlv_8= '{' (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )? otherlv_16= '}'
            {
            // InternalSiriusTextDsl.g:1450:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DOCUMENTATION) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSiriusTextDsl.g:1451:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1451:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1452:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_45); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSectionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1468:3: (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalSiriusTextDsl.g:1468:5: otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_10); 

                        	newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getIconPathKeyword_1_0());
                        
                    // InternalSiriusTextDsl.g:1472:1: ( (lv_iconPath_2_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1473:1: (lv_iconPath_2_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1473:1: (lv_iconPath_2_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1474:3: lv_iconPath_2_0= RULE_STRING
                    {
                    lv_iconPath_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_iconPath_2_0, grammarAccess.getSectionAccess().getIconPathSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"iconPath",
                            		lv_iconPath_2_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_46); 

                        	newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getSectionKeyword_2());
                
            // InternalSiriusTextDsl.g:1498:1: ( (lv_name_5_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1499:1: (lv_name_5_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1499:1: (lv_name_5_0= RULE_ID )
            // InternalSiriusTextDsl.g:1500:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            			newLeafNode(lv_name_5_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1516:2: (otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==16) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalSiriusTextDsl.g:1516:4: otherlv_6= 'as' ( (lv_label_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getAsKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:1520:1: ( (lv_label_7_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1521:1: (lv_label_7_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1521:1: (lv_label_7_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1522:3: lv_label_7_0= RULE_STRING
                    {
                    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    			newLeafNode(lv_label_7_0, grammarAccess.getSectionAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_7_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_47); 

                	newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_5());
                
            // InternalSiriusTextDsl.g:1542:1: (otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalSiriusTextDsl.g:1542:3: otherlv_9= 'tools' otherlv_10= '=' otherlv_11= '[' ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_15= ']'
                    {
                    otherlv_9=(Token)match(input,48,FOLLOW_17); 

                        	newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getToolsKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_10, grammarAccess.getSectionAccess().getEqualsSignKeyword_6_1());
                        
                    otherlv_11=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getLeftSquareBracketKeyword_6_2());
                        
                    // InternalSiriusTextDsl.g:1554:1: ( ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_ID) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1554:2: ( ( ruleQualifiedName ) ) (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1554:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1555:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1555:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1556:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getSectionRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getSectionAccess().getToolsToolCrossReference_6_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1569:2: (otherlv_13= ',' ( ( ruleQualifiedName ) ) )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==25) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1569:4: otherlv_13= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_13=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getCommaKeyword_6_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1573:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1574:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1574:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1575:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getSectionRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getSectionAccess().getToolsToolCrossReference_6_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,26,FOLLOW_23); 

                        	newLeafNode(otherlv_15, grammarAccess.getSectionAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_16, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleTool"
    // InternalSiriusTextDsl.g:1604:1: entryRuleTool returns [EObject current=null] : iv_ruleTool= ruleTool EOF ;
    public final EObject entryRuleTool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTool = null;


        try {
            // InternalSiriusTextDsl.g:1605:2: (iv_ruleTool= ruleTool EOF )
            // InternalSiriusTextDsl.g:1606:2: iv_ruleTool= ruleTool EOF
            {
             newCompositeNode(grammarAccess.getToolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTool=ruleTool();

            state._fsp--;

             current =iv_ruleTool; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTool"


    // $ANTLR start "ruleTool"
    // InternalSiriusTextDsl.g:1613:1: ruleTool returns [EObject current=null] : this_ContainerCreation_0= ruleContainerCreation ;
    public final EObject ruleTool() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerCreation_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1616:28: (this_ContainerCreation_0= ruleContainerCreation )
            // InternalSiriusTextDsl.g:1618:5: this_ContainerCreation_0= ruleContainerCreation
            {
             
                    newCompositeNode(grammarAccess.getToolAccess().getContainerCreationParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_ContainerCreation_0=ruleContainerCreation();

            state._fsp--;

             
                    current = this_ContainerCreation_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTool"


    // $ANTLR start "entryRuleContainerCreation"
    // InternalSiriusTextDsl.g:1634:1: entryRuleContainerCreation returns [EObject current=null] : iv_ruleContainerCreation= ruleContainerCreation EOF ;
    public final EObject entryRuleContainerCreation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerCreation = null;


        try {
            // InternalSiriusTextDsl.g:1635:2: (iv_ruleContainerCreation= ruleContainerCreation EOF )
            // InternalSiriusTextDsl.g:1636:2: iv_ruleContainerCreation= ruleContainerCreation EOF
            {
             newCompositeNode(grammarAccess.getContainerCreationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerCreation=ruleContainerCreation();

            state._fsp--;

             current =iv_ruleContainerCreation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerCreation"


    // $ANTLR start "ruleContainerCreation"
    // InternalSiriusTextDsl.g:1643:1: ruleContainerCreation returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= '@NodeCreationVariable' otherlv_6= '(' ( (lv_nodeCreationVariable_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '@ContainerViewVariable' otherlv_10= '(' ( (lv_containerViewVariable_11_0= RULE_STRING ) ) otherlv_12= ')' otherlv_13= 'containerCreation' ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'as' ( (lv_label_16_0= RULE_STRING ) ) )? (otherlv_17= '?' ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) ) )? otherlv_19= '{' otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' ) ;
    public final EObject ruleContainerCreation() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_forceRefresh_1_0=null;
        Token otherlv_2=null;
        Token lv_iconPath_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_nodeCreationVariable_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_containerViewVariable_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_15=null;
        Token lv_label_16_0=null;
        Token otherlv_17=null;
        Token lv_preconditionExpression_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        EObject lv_body_36_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1646:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= '@NodeCreationVariable' otherlv_6= '(' ( (lv_nodeCreationVariable_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '@ContainerViewVariable' otherlv_10= '(' ( (lv_containerViewVariable_11_0= RULE_STRING ) ) otherlv_12= ')' otherlv_13= 'containerCreation' ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'as' ( (lv_label_16_0= RULE_STRING ) ) )? (otherlv_17= '?' ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) ) )? otherlv_19= '{' otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' ) )
            // InternalSiriusTextDsl.g:1647:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= '@NodeCreationVariable' otherlv_6= '(' ( (lv_nodeCreationVariable_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '@ContainerViewVariable' otherlv_10= '(' ( (lv_containerViewVariable_11_0= RULE_STRING ) ) otherlv_12= ')' otherlv_13= 'containerCreation' ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'as' ( (lv_label_16_0= RULE_STRING ) ) )? (otherlv_17= '?' ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) ) )? otherlv_19= '{' otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' )
            {
            // InternalSiriusTextDsl.g:1647:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= '@NodeCreationVariable' otherlv_6= '(' ( (lv_nodeCreationVariable_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '@ContainerViewVariable' otherlv_10= '(' ( (lv_containerViewVariable_11_0= RULE_STRING ) ) otherlv_12= ')' otherlv_13= 'containerCreation' ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'as' ( (lv_label_16_0= RULE_STRING ) ) )? (otherlv_17= '?' ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) ) )? otherlv_19= '{' otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}' )
            // InternalSiriusTextDsl.g:1647:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= '@NodeCreationVariable' otherlv_6= '(' ( (lv_nodeCreationVariable_7_0= RULE_STRING ) ) otherlv_8= ')' otherlv_9= '@ContainerViewVariable' otherlv_10= '(' ( (lv_containerViewVariable_11_0= RULE_STRING ) ) otherlv_12= ')' otherlv_13= 'containerCreation' ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'as' ( (lv_label_16_0= RULE_STRING ) ) )? (otherlv_17= '?' ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) ) )? otherlv_19= '{' otherlv_20= 'containerMappings' otherlv_21= '=' otherlv_22= '[' ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_26= ']' (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )? otherlv_34= 'begin' otherlv_35= '{' ( (lv_body_36_0= ruleOperation ) )? otherlv_37= '}' otherlv_38= '}'
            {
            // InternalSiriusTextDsl.g:1647:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_DOCUMENTATION) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalSiriusTextDsl.g:1648:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:1648:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:1649:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_48); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getContainerCreationAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1665:3: ( (lv_forceRefresh_1_0= '@ForceRefresh' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalSiriusTextDsl.g:1666:1: (lv_forceRefresh_1_0= '@ForceRefresh' )
                    {
                    // InternalSiriusTextDsl.g:1666:1: (lv_forceRefresh_1_0= '@ForceRefresh' )
                    // InternalSiriusTextDsl.g:1667:3: lv_forceRefresh_1_0= '@ForceRefresh'
                    {
                    lv_forceRefresh_1_0=(Token)match(input,49,FOLLOW_49); 

                            newLeafNode(lv_forceRefresh_1_0, grammarAccess.getContainerCreationAccess().getForceRefreshForceRefreshKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(current, "forceRefresh", true, "@ForceRefresh");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1680:3: (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==19) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalSiriusTextDsl.g:1680:5: otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_10); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainerCreationAccess().getIconPathKeyword_2_0());
                        
                    // InternalSiriusTextDsl.g:1684:1: ( (lv_iconPath_3_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1685:1: (lv_iconPath_3_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1685:1: (lv_iconPath_3_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1686:3: lv_iconPath_3_0= RULE_STRING
                    {
                    lv_iconPath_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_iconPath_3_0, grammarAccess.getContainerCreationAccess().getIconPathSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"iconPath",
                            		lv_iconPath_3_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_50); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerCreationAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FOLLOW_51); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerCreationAccess().getNodeCreationVariableKeyword_3());
                
            otherlv_6=(Token)match(input,51,FOLLOW_10); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerCreationAccess().getLeftParenthesisKeyword_4());
                
            // InternalSiriusTextDsl.g:1714:1: ( (lv_nodeCreationVariable_7_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1715:1: (lv_nodeCreationVariable_7_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1715:1: (lv_nodeCreationVariable_7_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1716:3: lv_nodeCreationVariable_7_0= RULE_STRING
            {
            lv_nodeCreationVariable_7_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            			newLeafNode(lv_nodeCreationVariable_7_0, grammarAccess.getContainerCreationAccess().getNodeCreationVariableSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nodeCreationVariable",
                    		lv_nodeCreationVariable_7_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_52); 

                	newLeafNode(otherlv_8, grammarAccess.getContainerCreationAccess().getRightParenthesisKeyword_6());
                
            otherlv_9=(Token)match(input,52,FOLLOW_51); 

                	newLeafNode(otherlv_9, grammarAccess.getContainerCreationAccess().getContainerViewVariableKeyword_7());
                
            otherlv_10=(Token)match(input,51,FOLLOW_10); 

                	newLeafNode(otherlv_10, grammarAccess.getContainerCreationAccess().getLeftParenthesisKeyword_8());
                
            // InternalSiriusTextDsl.g:1744:1: ( (lv_containerViewVariable_11_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:1745:1: (lv_containerViewVariable_11_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:1745:1: (lv_containerViewVariable_11_0= RULE_STRING )
            // InternalSiriusTextDsl.g:1746:3: lv_containerViewVariable_11_0= RULE_STRING
            {
            lv_containerViewVariable_11_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            			newLeafNode(lv_containerViewVariable_11_0, grammarAccess.getContainerCreationAccess().getContainerViewVariableSTRINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewVariable",
                    		lv_containerViewVariable_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_53); 

                	newLeafNode(otherlv_12, grammarAccess.getContainerCreationAccess().getRightParenthesisKeyword_10());
                
            otherlv_13=(Token)match(input,53,FOLLOW_4); 

                	newLeafNode(otherlv_13, grammarAccess.getContainerCreationAccess().getContainerCreationKeyword_11());
                
            // InternalSiriusTextDsl.g:1770:1: ( (lv_name_14_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:1771:1: (lv_name_14_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:1771:1: (lv_name_14_0= RULE_ID )
            // InternalSiriusTextDsl.g:1772:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            			newLeafNode(lv_name_14_0, grammarAccess.getContainerCreationAccess().getNameIDTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerCreationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_14_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:1788:2: (otherlv_15= 'as' ( (lv_label_16_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==16) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalSiriusTextDsl.g:1788:4: otherlv_15= 'as' ( (lv_label_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_15, grammarAccess.getContainerCreationAccess().getAsKeyword_13_0());
                        
                    // InternalSiriusTextDsl.g:1792:1: ( (lv_label_16_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:1793:1: (lv_label_16_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:1793:1: (lv_label_16_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:1794:3: lv_label_16_0= RULE_STRING
                    {
                    lv_label_16_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    			newLeafNode(lv_label_16_0, grammarAccess.getContainerCreationAccess().getLabelSTRINGTerminalRuleCall_13_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_16_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:1810:4: (otherlv_17= '?' ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalSiriusTextDsl.g:1810:6: otherlv_17= '?' ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) )
                    {
                    otherlv_17=(Token)match(input,37,FOLLOW_34); 

                        	newLeafNode(otherlv_17, grammarAccess.getContainerCreationAccess().getQuestionMarkKeyword_14_0());
                        
                    // InternalSiriusTextDsl.g:1814:1: ( (lv_preconditionExpression_18_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:1815:1: (lv_preconditionExpression_18_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:1815:1: (lv_preconditionExpression_18_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:1816:3: lv_preconditionExpression_18_0= RULE_EXPRESSION
                    {
                    lv_preconditionExpression_18_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_preconditionExpression_18_0, grammarAccess.getContainerCreationAccess().getPreconditionExpressionEXPRESSIONTerminalRuleCall_14_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preconditionExpression",
                            		lv_preconditionExpression_18_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_55); 

                	newLeafNode(otherlv_19, grammarAccess.getContainerCreationAccess().getLeftCurlyBracketKeyword_15());
                
            otherlv_20=(Token)match(input,54,FOLLOW_17); 

                	newLeafNode(otherlv_20, grammarAccess.getContainerCreationAccess().getContainerMappingsKeyword_16());
                
            otherlv_21=(Token)match(input,23,FOLLOW_18); 

                	newLeafNode(otherlv_21, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_17());
                
            otherlv_22=(Token)match(input,24,FOLLOW_21); 

                	newLeafNode(otherlv_22, grammarAccess.getContainerCreationAccess().getLeftSquareBracketKeyword_18());
                
            // InternalSiriusTextDsl.g:1848:1: ( ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalSiriusTextDsl.g:1848:2: ( ( ruleQualifiedName ) ) (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:1848:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:1849:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:1849:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:1850:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getContainerMappingsMappingCrossReference_19_0_0()); 
                    	    
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:1863:2: (otherlv_24= ',' ( ( ruleQualifiedName ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==25) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:1863:4: otherlv_24= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_24=(Token)match(input,25,FOLLOW_4); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getContainerCreationAccess().getCommaKeyword_19_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:1867:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:1868:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:1868:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:1869:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getContainerMappingsMappingCrossReference_19_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_19);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_26=(Token)match(input,26,FOLLOW_56); 

                	newLeafNode(otherlv_26, grammarAccess.getContainerCreationAccess().getRightSquareBracketKeyword_20());
                
            // InternalSiriusTextDsl.g:1886:1: (otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==55) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalSiriusTextDsl.g:1886:3: otherlv_27= 'extraMappings' otherlv_28= '=' otherlv_29= '[' ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_33= ']'
                    {
                    otherlv_27=(Token)match(input,55,FOLLOW_17); 

                        	newLeafNode(otherlv_27, grammarAccess.getContainerCreationAccess().getExtraMappingsKeyword_21_0());
                        
                    otherlv_28=(Token)match(input,23,FOLLOW_18); 

                        	newLeafNode(otherlv_28, grammarAccess.getContainerCreationAccess().getEqualsSignKeyword_21_1());
                        
                    otherlv_29=(Token)match(input,24,FOLLOW_21); 

                        	newLeafNode(otherlv_29, grammarAccess.getContainerCreationAccess().getLeftSquareBracketKeyword_21_2());
                        
                    // InternalSiriusTextDsl.g:1898:1: ( ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_ID) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalSiriusTextDsl.g:1898:2: ( ( ruleQualifiedName ) ) (otherlv_31= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // InternalSiriusTextDsl.g:1898:2: ( ( ruleQualifiedName ) )
                            // InternalSiriusTextDsl.g:1899:1: ( ruleQualifiedName )
                            {
                            // InternalSiriusTextDsl.g:1899:1: ( ruleQualifiedName )
                            // InternalSiriusTextDsl.g:1900:3: ruleQualifiedName
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getContainerCreationRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getContainerCreationAccess().getExtraMappingsMappingCrossReference_21_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_19);
                            ruleQualifiedName();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // InternalSiriusTextDsl.g:1913:2: (otherlv_31= ',' ( ( ruleQualifiedName ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==25) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // InternalSiriusTextDsl.g:1913:4: otherlv_31= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_31=(Token)match(input,25,FOLLOW_4); 

                            	        	newLeafNode(otherlv_31, grammarAccess.getContainerCreationAccess().getCommaKeyword_21_3_1_0());
                            	        
                            	    // InternalSiriusTextDsl.g:1917:1: ( ( ruleQualifiedName ) )
                            	    // InternalSiriusTextDsl.g:1918:1: ( ruleQualifiedName )
                            	    {
                            	    // InternalSiriusTextDsl.g:1918:1: ( ruleQualifiedName )
                            	    // InternalSiriusTextDsl.g:1919:3: ruleQualifiedName
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getContainerCreationRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getExtraMappingsMappingCrossReference_21_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_19);
                            	    ruleQualifiedName();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_33=(Token)match(input,26,FOLLOW_57); 

                        	newLeafNode(otherlv_33, grammarAccess.getContainerCreationAccess().getRightSquareBracketKeyword_21_4());
                        

                    }
                    break;

            }

            otherlv_34=(Token)match(input,56,FOLLOW_11); 

                	newLeafNode(otherlv_34, grammarAccess.getContainerCreationAccess().getBeginKeyword_22());
                
            otherlv_35=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_35, grammarAccess.getContainerCreationAccess().getLeftCurlyBracketKeyword_23());
                
            // InternalSiriusTextDsl.g:1944:1: ( (lv_body_36_0= ruleOperation ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==36||LA63_0==57||(LA63_0>=59 && LA63_0<=60)||LA63_0==63||LA63_0==65||LA63_0==68||LA63_0==71||LA63_0==74||(LA63_0>=76 && LA63_0<=77)||LA63_0==79) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalSiriusTextDsl.g:1945:1: (lv_body_36_0= ruleOperation )
                    {
                    // InternalSiriusTextDsl.g:1945:1: (lv_body_36_0= ruleOperation )
                    // InternalSiriusTextDsl.g:1946:3: lv_body_36_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerCreationAccess().getBodyOperationParserRuleCall_24_0()); 
                    	    
                    pushFollow(FOLLOW_23);
                    lv_body_36_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerCreationRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_36_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_37=(Token)match(input,18,FOLLOW_23); 

                	newLeafNode(otherlv_37, grammarAccess.getContainerCreationAccess().getRightCurlyBracketKeyword_25());
                
            otherlv_38=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_38, grammarAccess.getContainerCreationAccess().getRightCurlyBracketKeyword_26());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerCreation"


    // $ANTLR start "entryRuleOperation"
    // InternalSiriusTextDsl.g:1978:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSiriusTextDsl.g:1979:2: (iv_ruleOperation= ruleOperation EOF )
            // InternalSiriusTextDsl.g:1980:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSiriusTextDsl.g:1987:1: ruleOperation returns [EObject current=null] : (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_ChangeContext_0 = null;

        EObject this_For_1 = null;

        EObject this_If_2 = null;

        EObject this_Set_3 = null;

        EObject this_CreateInstance_4 = null;

        EObject this_CreateView_5 = null;

        EObject this_Unset_6 = null;

        EObject this_CreateEdgeView_7 = null;

        EObject this_DeleteView_8 = null;

        EObject this_Remove_9 = null;

        EObject this_Move_10 = null;

        EObject this_Switch_11 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:1990:28: ( (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch ) )
            // InternalSiriusTextDsl.g:1991:1: (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch )
            {
            // InternalSiriusTextDsl.g:1991:1: (this_ChangeContext_0= ruleChangeContext | this_For_1= ruleFor | this_If_2= ruleIf | this_Set_3= ruleSet | this_CreateInstance_4= ruleCreateInstance | this_CreateView_5= ruleCreateView | this_Unset_6= ruleUnset | this_CreateEdgeView_7= ruleCreateEdgeView | this_DeleteView_8= ruleDeleteView | this_Remove_9= ruleRemove | this_Move_10= ruleMove | this_Switch_11= ruleSwitch )
            int alt64=12;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt64=1;
                }
                break;
            case 36:
                {
                alt64=2;
                }
                break;
            case 59:
                {
                alt64=3;
                }
                break;
            case 60:
                {
                alt64=4;
                }
                break;
            case 65:
                {
                alt64=5;
                }
                break;
            case 68:
                {
                alt64=6;
                }
                break;
            case 63:
                {
                alt64=7;
                }
                break;
            case 71:
                {
                alt64=8;
                }
                break;
            case 74:
                {
                alt64=9;
                }
                break;
            case 76:
                {
                alt64=10;
                }
                break;
            case 77:
                {
                alt64=11;
                }
                break;
            case 79:
                {
                alt64=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalSiriusTextDsl.g:1992:5: this_ChangeContext_0= ruleChangeContext
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getChangeContextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ChangeContext_0=ruleChangeContext();

                    state._fsp--;

                     
                            current = this_ChangeContext_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:2002:5: this_For_1= ruleFor
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getForParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_For_1=ruleFor();

                    state._fsp--;

                     
                            current = this_For_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:2012:5: this_If_2= ruleIf
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getIfParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_If_2=ruleIf();

                    state._fsp--;

                     
                            current = this_If_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:2022:5: this_Set_3= ruleSet
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getSetParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Set_3=ruleSet();

                    state._fsp--;

                     
                            current = this_Set_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:2032:5: this_CreateInstance_4= ruleCreateInstance
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateInstanceParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateInstance_4=ruleCreateInstance();

                    state._fsp--;

                     
                            current = this_CreateInstance_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:2042:5: this_CreateView_5= ruleCreateView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateViewParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateView_5=ruleCreateView();

                    state._fsp--;

                     
                            current = this_CreateView_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:2052:5: this_Unset_6= ruleUnset
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getUnsetParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Unset_6=ruleUnset();

                    state._fsp--;

                     
                            current = this_Unset_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:2062:5: this_CreateEdgeView_7= ruleCreateEdgeView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getCreateEdgeViewParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CreateEdgeView_7=ruleCreateEdgeView();

                    state._fsp--;

                     
                            current = this_CreateEdgeView_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:2072:5: this_DeleteView_8= ruleDeleteView
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getDeleteViewParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_DeleteView_8=ruleDeleteView();

                    state._fsp--;

                     
                            current = this_DeleteView_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:2082:5: this_Remove_9= ruleRemove
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getRemoveParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Remove_9=ruleRemove();

                    state._fsp--;

                     
                            current = this_Remove_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:2092:5: this_Move_10= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getMoveParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Move_10=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // InternalSiriusTextDsl.g:2102:5: this_Switch_11= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getOperationAccess().getSwitchParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Switch_11=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleChangeContext"
    // InternalSiriusTextDsl.g:2118:1: entryRuleChangeContext returns [EObject current=null] : iv_ruleChangeContext= ruleChangeContext EOF ;
    public final EObject entryRuleChangeContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeContext = null;


        try {
            // InternalSiriusTextDsl.g:2119:2: (iv_ruleChangeContext= ruleChangeContext EOF )
            // InternalSiriusTextDsl.g:2120:2: iv_ruleChangeContext= ruleChangeContext EOF
            {
             newCompositeNode(grammarAccess.getChangeContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeContext=ruleChangeContext();

            state._fsp--;

             current =iv_ruleChangeContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeContext"


    // $ANTLR start "ruleChangeContext"
    // InternalSiriusTextDsl.g:2127:1: ruleChangeContext returns [EObject current=null] : (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleChangeContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_browseExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2130:28: ( (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? ) )
            // InternalSiriusTextDsl.g:2131:1: (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? )
            {
            // InternalSiriusTextDsl.g:2131:1: (otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )? )
            // InternalSiriusTextDsl.g:2131:3: otherlv_0= 'changeContext' otherlv_1= '(' ( (lv_browseExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeContextAccess().getChangeContextKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_34); 

                	newLeafNode(otherlv_1, grammarAccess.getChangeContextAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2139:1: ( (lv_browseExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2140:1: (lv_browseExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2140:1: (lv_browseExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2141:3: lv_browseExpression_2_0= RULE_EXPRESSION
            {
            lv_browseExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

            			newLeafNode(lv_browseExpression_2_0, grammarAccess.getChangeContextAccess().getBrowseExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChangeContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"browseExpression",
                    		lv_browseExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_59); 

                	newLeafNode(otherlv_3, grammarAccess.getChangeContextAccess().getRightParenthesisKeyword_3());
                
            // InternalSiriusTextDsl.g:2161:1: (otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==17) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalSiriusTextDsl.g:2161:3: otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_4, grammarAccess.getChangeContextAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:2165:1: ( (lv_body_5_0= ruleOperation ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==36||LA65_0==57||(LA65_0>=59 && LA65_0<=60)||LA65_0==63||LA65_0==65||LA65_0==68||LA65_0==71||LA65_0==74||(LA65_0>=76 && LA65_0<=77)||LA65_0==79) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2166:1: (lv_body_5_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2166:1: (lv_body_5_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2167:3: lv_body_5_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getChangeContextAccess().getBodyOperationParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_5_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getChangeContextRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_5_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getChangeContextAccess().getRightCurlyBracketKeyword_4_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeContext"


    // $ANTLR start "entryRuleFor"
    // InternalSiriusTextDsl.g:2195:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalSiriusTextDsl.g:2196:2: (iv_ruleFor= ruleFor EOF )
            // InternalSiriusTextDsl.g:2197:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalSiriusTextDsl.g:2204:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_iteratorName_2_0=null;
        Token otherlv_3=null;
        Token lv_expression_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2207:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' ) )
            // InternalSiriusTextDsl.g:2208:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' )
            {
            // InternalSiriusTextDsl.g:2208:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}' )
            // InternalSiriusTextDsl.g:2208:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_iteratorName_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_expression_4_0= RULE_EXPRESSION ) ) otherlv_5= ')' otherlv_6= '{' ( (lv_body_7_0= ruleOperation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_10); 

                	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2216:1: ( (lv_iteratorName_2_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2217:1: (lv_iteratorName_2_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2217:1: (lv_iteratorName_2_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2218:3: lv_iteratorName_2_0= RULE_STRING
            {
            lv_iteratorName_2_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            			newLeafNode(lv_iteratorName_2_0, grammarAccess.getForAccess().getIteratorNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iteratorName",
                    		lv_iteratorName_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,58,FOLLOW_34); 

                	newLeafNode(otherlv_3, grammarAccess.getForAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2238:1: ( (lv_expression_4_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2239:1: (lv_expression_4_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2239:1: (lv_expression_4_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2240:3: lv_expression_4_0= RULE_EXPRESSION
            {
            lv_expression_4_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

            			newLeafNode(lv_expression_4_0, grammarAccess.getForAccess().getExpressionEXPRESSIONTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_11); 

                	newLeafNode(otherlv_5, grammarAccess.getForAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_6, grammarAccess.getForAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSiriusTextDsl.g:2264:1: ( (lv_body_7_0= ruleOperation ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==36||LA67_0==57||(LA67_0>=59 && LA67_0<=60)||LA67_0==63||LA67_0==65||LA67_0==68||LA67_0==71||LA67_0==74||(LA67_0>=76 && LA67_0<=77)||LA67_0==79) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2265:1: (lv_body_7_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:2265:1: (lv_body_7_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:2266:3: lv_body_7_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForAccess().getBodyOperationParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_7_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_7_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_8, grammarAccess.getForAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // InternalSiriusTextDsl.g:2294:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalSiriusTextDsl.g:2295:2: (iv_ruleIf= ruleIf EOF )
            // InternalSiriusTextDsl.g:2296:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalSiriusTextDsl.g:2303:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_conditionExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2306:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // InternalSiriusTextDsl.g:2307:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // InternalSiriusTextDsl.g:2307:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            // InternalSiriusTextDsl.g:2307:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_34); 

                	newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:2315:1: ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2316:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2316:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2317:3: lv_conditionExpression_2_0= RULE_EXPRESSION
            {
            lv_conditionExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

            			newLeafNode(lv_conditionExpression_2_0, grammarAccess.getIfAccess().getConditionExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIfRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionExpression",
                    		lv_conditionExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:2341:1: ( (lv_body_5_0= ruleOperation ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==36||LA68_0==57||(LA68_0>=59 && LA68_0<=60)||LA68_0==63||LA68_0==65||LA68_0==68||LA68_0==71||LA68_0==74||(LA68_0>=76 && LA68_0<=77)||LA68_0==79) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:2342:1: (lv_body_5_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:2342:1: (lv_body_5_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:2343:3: lv_body_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfAccess().getBodyOperationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_5_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleSet"
    // InternalSiriusTextDsl.g:2371:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalSiriusTextDsl.g:2372:2: (iv_ruleSet= ruleSet EOF )
            // InternalSiriusTextDsl.g:2373:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalSiriusTextDsl.g:2380:1: ruleSet returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_featureName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_valueExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2383:28: ( (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:2384:1: (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:2384:1: (otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:2384:3: otherlv_0= 'set' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'valueExpression' otherlv_7= ':' ( (lv_valueExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_61); 

                	newLeafNode(otherlv_1, grammarAccess.getSetAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,61,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getFeatureNameKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getSetAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2400:1: ( (lv_featureName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2401:1: (lv_featureName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2401:1: (lv_featureName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2402:3: lv_featureName_4_0= RULE_STRING
            {
            lv_featureName_4_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            			newLeafNode(lv_featureName_4_0, grammarAccess.getSetAccess().getFeatureNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_63); 

                	newLeafNode(otherlv_5, grammarAccess.getSetAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,62,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getSetAccess().getValueExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_34); 

                	newLeafNode(otherlv_7, grammarAccess.getSetAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2430:1: ( (lv_valueExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2431:1: (lv_valueExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2431:1: (lv_valueExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2432:3: lv_valueExpression_8_0= RULE_EXPRESSION
            {
            lv_valueExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

            			newLeafNode(lv_valueExpression_8_0, grammarAccess.getSetAccess().getValueExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valueExpression",
                    		lv_valueExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_59); 

                	newLeafNode(otherlv_9, grammarAccess.getSetAccess().getRightParenthesisKeyword_9());
                
            // InternalSiriusTextDsl.g:2452:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==17) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalSiriusTextDsl.g:2452:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_10, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // InternalSiriusTextDsl.g:2456:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==36||LA69_0==57||(LA69_0>=59 && LA69_0<=60)||LA69_0==63||LA69_0==65||LA69_0==68||LA69_0==71||LA69_0==74||(LA69_0>=76 && LA69_0<=77)||LA69_0==79) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2457:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2457:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2458:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSetAccess().getBodyOperationParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_10_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleUnset"
    // InternalSiriusTextDsl.g:2486:1: entryRuleUnset returns [EObject current=null] : iv_ruleUnset= ruleUnset EOF ;
    public final EObject entryRuleUnset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnset = null;


        try {
            // InternalSiriusTextDsl.g:2487:2: (iv_ruleUnset= ruleUnset EOF )
            // InternalSiriusTextDsl.g:2488:2: iv_ruleUnset= ruleUnset EOF
            {
             newCompositeNode(grammarAccess.getUnsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnset=ruleUnset();

            state._fsp--;

             current =iv_ruleUnset; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnset"


    // $ANTLR start "ruleUnset"
    // InternalSiriusTextDsl.g:2495:1: ruleUnset returns [EObject current=null] : (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleUnset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_featureName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_elementExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2498:28: ( (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:2499:1: (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:2499:1: (otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:2499:3: otherlv_0= 'unset' otherlv_1= '(' otherlv_2= 'featureName' otherlv_3= ':' ( (lv_featureName_4_0= RULE_STRING ) ) (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getUnsetAccess().getUnsetKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_61); 

                	newLeafNode(otherlv_1, grammarAccess.getUnsetAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,61,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getUnsetAccess().getFeatureNameKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getUnsetAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2515:1: ( (lv_featureName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2516:1: (lv_featureName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2516:1: (lv_featureName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2517:3: lv_featureName_4_0= RULE_STRING
            {
            lv_featureName_4_0=(Token)match(input,RULE_STRING,FOLLOW_64); 

            			newLeafNode(lv_featureName_4_0, grammarAccess.getUnsetAccess().getFeatureNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2533:2: (otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalSiriusTextDsl.g:2533:4: otherlv_5= ',' otherlv_6= 'elementExpression' otherlv_7= ':' ( (lv_elementExpression_8_0= RULE_EXPRESSION ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_65); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnsetAccess().getCommaKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,64,FOLLOW_60); 

                        	newLeafNode(otherlv_6, grammarAccess.getUnsetAccess().getElementExpressionKeyword_5_1());
                        
                    otherlv_7=(Token)match(input,58,FOLLOW_34); 

                        	newLeafNode(otherlv_7, grammarAccess.getUnsetAccess().getColonKeyword_5_2());
                        
                    // InternalSiriusTextDsl.g:2545:1: ( (lv_elementExpression_8_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:2546:1: (lv_elementExpression_8_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:2546:1: (lv_elementExpression_8_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:2547:3: lv_elementExpression_8_0= RULE_EXPRESSION
                    {
                    lv_elementExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

                    			newLeafNode(lv_elementExpression_8_0, grammarAccess.getUnsetAccess().getElementExpressionEXPRESSIONTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsetRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elementExpression",
                            		lv_elementExpression_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_59); 

                	newLeafNode(otherlv_9, grammarAccess.getUnsetAccess().getRightParenthesisKeyword_6());
                
            // InternalSiriusTextDsl.g:2567:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==17) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalSiriusTextDsl.g:2567:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_10, grammarAccess.getUnsetAccess().getLeftCurlyBracketKeyword_7_0());
                        
                    // InternalSiriusTextDsl.g:2571:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==36||LA72_0==57||(LA72_0>=59 && LA72_0<=60)||LA72_0==63||LA72_0==65||LA72_0==68||LA72_0==71||LA72_0==74||(LA72_0>=76 && LA72_0<=77)||LA72_0==79) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2572:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2572:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2573:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUnsetAccess().getBodyOperationParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUnsetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getUnsetAccess().getRightCurlyBracketKeyword_7_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnset"


    // $ANTLR start "entryRuleCreateInstance"
    // InternalSiriusTextDsl.g:2601:1: entryRuleCreateInstance returns [EObject current=null] : iv_ruleCreateInstance= ruleCreateInstance EOF ;
    public final EObject entryRuleCreateInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateInstance = null;


        try {
            // InternalSiriusTextDsl.g:2602:2: (iv_ruleCreateInstance= ruleCreateInstance EOF )
            // InternalSiriusTextDsl.g:2603:2: iv_ruleCreateInstance= ruleCreateInstance EOF
            {
             newCompositeNode(grammarAccess.getCreateInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateInstance=ruleCreateInstance();

            state._fsp--;

             current =iv_ruleCreateInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateInstance"


    // $ANTLR start "ruleCreateInstance"
    // InternalSiriusTextDsl.g:2610:1: ruleCreateInstance returns [EObject current=null] : (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleCreateInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_referenceName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_variableName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2613:28: ( (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) )
            // InternalSiriusTextDsl.g:2614:1: (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            {
            // InternalSiriusTextDsl.g:2614:1: (otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            // InternalSiriusTextDsl.g:2614:3: otherlv_0= 'createInstance' otherlv_1= '(' otherlv_2= 'referenceName' otherlv_3= ':' ( (lv_referenceName_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= ':' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateInstanceAccess().getCreateInstanceKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_66); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateInstanceAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,66,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateInstanceAccess().getReferenceNameKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateInstanceAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2630:1: ( (lv_referenceName_4_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2631:1: (lv_referenceName_4_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2631:1: (lv_referenceName_4_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2632:3: lv_referenceName_4_0= RULE_STRING
            {
            lv_referenceName_4_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            			newLeafNode(lv_referenceName_4_0, grammarAccess.getCreateInstanceAccess().getReferenceNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"referenceName",
                    		lv_referenceName_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_67); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateInstanceAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,67,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateInstanceAccess().getTypeKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateInstanceAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2660:1: ( (lv_type_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2661:1: (lv_type_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2661:1: (lv_type_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2662:3: lv_type_8_0= RULE_STRING
            {
            lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            			newLeafNode(lv_type_8_0, grammarAccess.getCreateInstanceAccess().getTypeSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_68); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateInstanceAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateInstanceAccess().getAsKeyword_10());
                
            // InternalSiriusTextDsl.g:2686:1: ( (lv_variableName_11_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2687:1: (lv_variableName_11_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2687:1: (lv_variableName_11_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2688:3: lv_variableName_11_0= RULE_STRING
            {
            lv_variableName_11_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            			newLeafNode(lv_variableName_11_0, grammarAccess.getCreateInstanceAccess().getVariableNameSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2704:2: (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==17) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalSiriusTextDsl.g:2704:4: otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_12, grammarAccess.getCreateInstanceAccess().getLeftCurlyBracketKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:2708:1: ( (lv_body_13_0= ruleOperation ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==36||LA74_0==57||(LA74_0>=59 && LA74_0<=60)||LA74_0==63||LA74_0==65||LA74_0==68||LA74_0==71||LA74_0==74||(LA74_0>=76 && LA74_0<=77)||LA74_0==79) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2709:1: (lv_body_13_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2709:1: (lv_body_13_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2710:3: lv_body_13_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateInstanceAccess().getBodyOperationParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_13_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_13_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_14, grammarAccess.getCreateInstanceAccess().getRightCurlyBracketKeyword_12_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateInstance"


    // $ANTLR start "entryRuleCreateView"
    // InternalSiriusTextDsl.g:2738:1: entryRuleCreateView returns [EObject current=null] : iv_ruleCreateView= ruleCreateView EOF ;
    public final EObject entryRuleCreateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateView = null;


        try {
            // InternalSiriusTextDsl.g:2739:2: (iv_ruleCreateView= ruleCreateView EOF )
            // InternalSiriusTextDsl.g:2740:2: iv_ruleCreateView= ruleCreateView EOF
            {
             newCompositeNode(grammarAccess.getCreateViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateView=ruleCreateView();

            state._fsp--;

             current =iv_ruleCreateView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateView"


    // $ANTLR start "ruleCreateView"
    // InternalSiriusTextDsl.g:2747:1: ruleCreateView returns [EObject current=null] : (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleCreateView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_containerViewExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_variableName_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_body_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2750:28: ( (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? ) )
            // InternalSiriusTextDsl.g:2751:1: (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            {
            // InternalSiriusTextDsl.g:2751:1: (otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )? )
            // InternalSiriusTextDsl.g:2751:3: otherlv_0= 'createView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'containerViewExpression' otherlv_7= ':' ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ')' otherlv_10= 'as' ( (lv_variableName_11_0= RULE_STRING ) ) (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateViewAccess().getCreateViewKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_69); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateViewAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,69,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateViewAccess().getMappingKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateViewAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2767:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2768:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2768:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2769:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCreateViewAccess().getMappingMappingCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_62);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_70); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateViewAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,70,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateViewAccess().getContainerViewExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_34); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateViewAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2794:1: ( (lv_containerViewExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2795:1: (lv_containerViewExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2795:1: (lv_containerViewExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2796:3: lv_containerViewExpression_8_0= RULE_EXPRESSION
            {
            lv_containerViewExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

            			newLeafNode(lv_containerViewExpression_8_0, grammarAccess.getCreateViewAccess().getContainerViewExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewExpression",
                    		lv_containerViewExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_68); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateViewAccess().getRightParenthesisKeyword_9());
                
            otherlv_10=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateViewAccess().getAsKeyword_10());
                
            // InternalSiriusTextDsl.g:2820:1: ( (lv_variableName_11_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:2821:1: (lv_variableName_11_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:2821:1: (lv_variableName_11_0= RULE_STRING )
            // InternalSiriusTextDsl.g:2822:3: lv_variableName_11_0= RULE_STRING
            {
            lv_variableName_11_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            			newLeafNode(lv_variableName_11_0, grammarAccess.getCreateViewAccess().getVariableNameSTRINGTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:2838:2: (otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==17) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalSiriusTextDsl.g:2838:4: otherlv_12= '{' ( (lv_body_13_0= ruleOperation ) )* otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_12, grammarAccess.getCreateViewAccess().getLeftCurlyBracketKeyword_12_0());
                        
                    // InternalSiriusTextDsl.g:2842:1: ( (lv_body_13_0= ruleOperation ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==36||LA76_0==57||(LA76_0>=59 && LA76_0<=60)||LA76_0==63||LA76_0==65||LA76_0==68||LA76_0==71||LA76_0==74||(LA76_0>=76 && LA76_0<=77)||LA76_0==79) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:2843:1: (lv_body_13_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:2843:1: (lv_body_13_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:2844:3: lv_body_13_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateViewAccess().getBodyOperationParserRuleCall_12_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_13_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_13_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_14, grammarAccess.getCreateViewAccess().getRightCurlyBracketKeyword_12_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateView"


    // $ANTLR start "entryRuleCreateEdgeView"
    // InternalSiriusTextDsl.g:2872:1: entryRuleCreateEdgeView returns [EObject current=null] : iv_ruleCreateEdgeView= ruleCreateEdgeView EOF ;
    public final EObject entryRuleCreateEdgeView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateEdgeView = null;


        try {
            // InternalSiriusTextDsl.g:2873:2: (iv_ruleCreateEdgeView= ruleCreateEdgeView EOF )
            // InternalSiriusTextDsl.g:2874:2: iv_ruleCreateEdgeView= ruleCreateEdgeView EOF
            {
             newCompositeNode(grammarAccess.getCreateEdgeViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateEdgeView=ruleCreateEdgeView();

            state._fsp--;

             current =iv_ruleCreateEdgeView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateEdgeView"


    // $ANTLR start "ruleCreateEdgeView"
    // InternalSiriusTextDsl.g:2881:1: ruleCreateEdgeView returns [EObject current=null] : (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? ) ;
    public final EObject ruleCreateEdgeView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_sourceExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_targetExpression_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_containerViewExpression_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_variableName_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_body_21_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:2884:28: ( (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? ) )
            // InternalSiriusTextDsl.g:2885:1: (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? )
            {
            // InternalSiriusTextDsl.g:2885:1: (otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )? )
            // InternalSiriusTextDsl.g:2885:3: otherlv_0= 'createEdgeView' otherlv_1= '(' otherlv_2= 'mapping' otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'sourceExpression' otherlv_7= ':' ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) ) otherlv_9= ',' otherlv_10= 'targetExpression' otherlv_11= ':' ( (lv_targetExpression_12_0= RULE_EXPRESSION ) ) otherlv_13= ',' otherlv_14= 'containerViewExpression' otherlv_15= ':' ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) ) otherlv_17= ')' otherlv_18= 'as' ( (lv_variableName_19_0= RULE_STRING ) ) (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateEdgeViewAccess().getCreateEdgeViewKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_69); 

                	newLeafNode(otherlv_1, grammarAccess.getCreateEdgeViewAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,69,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getCreateEdgeViewAccess().getMappingKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:2901:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:2902:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:2902:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:2903:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCreateEdgeViewAccess().getEdgeEdgeCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_62);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_71); 

                	newLeafNode(otherlv_5, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,72,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getCreateEdgeViewAccess().getSourceExpressionKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_34); 

                	newLeafNode(otherlv_7, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:2928:1: ( (lv_sourceExpression_8_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2929:1: (lv_sourceExpression_8_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2929:1: (lv_sourceExpression_8_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2930:3: lv_sourceExpression_8_0= RULE_EXPRESSION
            {
            lv_sourceExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_62); 

            			newLeafNode(lv_sourceExpression_8_0, grammarAccess.getCreateEdgeViewAccess().getSourceExpressionEXPRESSIONTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourceExpression",
                    		lv_sourceExpression_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_72); 

                	newLeafNode(otherlv_9, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,73,FOLLOW_60); 

                	newLeafNode(otherlv_10, grammarAccess.getCreateEdgeViewAccess().getTargetExpressionKeyword_10());
                
            otherlv_11=(Token)match(input,58,FOLLOW_34); 

                	newLeafNode(otherlv_11, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_11());
                
            // InternalSiriusTextDsl.g:2958:1: ( (lv_targetExpression_12_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2959:1: (lv_targetExpression_12_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2959:1: (lv_targetExpression_12_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2960:3: lv_targetExpression_12_0= RULE_EXPRESSION
            {
            lv_targetExpression_12_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_62); 

            			newLeafNode(lv_targetExpression_12_0, grammarAccess.getCreateEdgeViewAccess().getTargetExpressionEXPRESSIONTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetExpression",
                    		lv_targetExpression_12_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_70); 

                	newLeafNode(otherlv_13, grammarAccess.getCreateEdgeViewAccess().getCommaKeyword_13());
                
            otherlv_14=(Token)match(input,70,FOLLOW_60); 

                	newLeafNode(otherlv_14, grammarAccess.getCreateEdgeViewAccess().getContainerViewExpressionKeyword_14());
                
            otherlv_15=(Token)match(input,58,FOLLOW_34); 

                	newLeafNode(otherlv_15, grammarAccess.getCreateEdgeViewAccess().getColonKeyword_15());
                
            // InternalSiriusTextDsl.g:2988:1: ( (lv_containerViewExpression_16_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:2989:1: (lv_containerViewExpression_16_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:2989:1: (lv_containerViewExpression_16_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:2990:3: lv_containerViewExpression_16_0= RULE_EXPRESSION
            {
            lv_containerViewExpression_16_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

            			newLeafNode(lv_containerViewExpression_16_0, grammarAccess.getCreateEdgeViewAccess().getContainerViewExpressionEXPRESSIONTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"containerViewExpression",
                    		lv_containerViewExpression_16_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_17=(Token)match(input,20,FOLLOW_68); 

                	newLeafNode(otherlv_17, grammarAccess.getCreateEdgeViewAccess().getRightParenthesisKeyword_17());
                
            otherlv_18=(Token)match(input,16,FOLLOW_10); 

                	newLeafNode(otherlv_18, grammarAccess.getCreateEdgeViewAccess().getAsKeyword_18());
                
            // InternalSiriusTextDsl.g:3014:1: ( (lv_variableName_19_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3015:1: (lv_variableName_19_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3015:1: (lv_variableName_19_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3016:3: lv_variableName_19_0= RULE_STRING
            {
            lv_variableName_19_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            			newLeafNode(lv_variableName_19_0, grammarAccess.getCreateEdgeViewAccess().getVariableNameSTRINGTerminalRuleCall_19_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateEdgeViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"variableName",
                    		lv_variableName_19_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            // InternalSiriusTextDsl.g:3032:2: (otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==17) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalSiriusTextDsl.g:3032:4: otherlv_20= '{' ( (lv_body_21_0= ruleOperation ) )* otherlv_22= '}'
                    {
                    otherlv_20=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_20, grammarAccess.getCreateEdgeViewAccess().getLeftCurlyBracketKeyword_20_0());
                        
                    // InternalSiriusTextDsl.g:3036:1: ( (lv_body_21_0= ruleOperation ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==36||LA78_0==57||(LA78_0>=59 && LA78_0<=60)||LA78_0==63||LA78_0==65||LA78_0==68||LA78_0==71||LA78_0==74||(LA78_0>=76 && LA78_0<=77)||LA78_0==79) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3037:1: (lv_body_21_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3037:1: (lv_body_21_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3038:3: lv_body_21_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCreateEdgeViewAccess().getBodyOperationParserRuleCall_20_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_21_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCreateEdgeViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_21_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_22, grammarAccess.getCreateEdgeViewAccess().getRightCurlyBracketKeyword_20_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateEdgeView"


    // $ANTLR start "entryRuleDeleteView"
    // InternalSiriusTextDsl.g:3066:1: entryRuleDeleteView returns [EObject current=null] : iv_ruleDeleteView= ruleDeleteView EOF ;
    public final EObject entryRuleDeleteView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteView = null;


        try {
            // InternalSiriusTextDsl.g:3067:2: (iv_ruleDeleteView= ruleDeleteView EOF )
            // InternalSiriusTextDsl.g:3068:2: iv_ruleDeleteView= ruleDeleteView EOF
            {
             newCompositeNode(grammarAccess.getDeleteViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteView=ruleDeleteView();

            state._fsp--;

             current =iv_ruleDeleteView; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteView"


    // $ANTLR start "ruleDeleteView"
    // InternalSiriusTextDsl.g:3075:1: ruleDeleteView returns [EObject current=null] : ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleDeleteView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3078:28: ( ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) )
            // InternalSiriusTextDsl.g:3079:1: ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            {
            // InternalSiriusTextDsl.g:3079:1: ( () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            // InternalSiriusTextDsl.g:3079:2: () otherlv_1= 'deleteView' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            {
            // InternalSiriusTextDsl.g:3079:2: ()
            // InternalSiriusTextDsl.g:3080:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeleteViewAccess().getDeleteViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FOLLOW_73); 

                	newLeafNode(otherlv_1, grammarAccess.getDeleteViewAccess().getDeleteViewKeyword_1());
                
            otherlv_2=(Token)match(input,75,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getDeleteViewAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            // InternalSiriusTextDsl.g:3093:1: (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==17) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalSiriusTextDsl.g:3093:3: otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_3, grammarAccess.getDeleteViewAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:3097:1: ( (lv_body_4_0= ruleOperation ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==36||LA80_0==57||(LA80_0>=59 && LA80_0<=60)||LA80_0==63||LA80_0==65||LA80_0==68||LA80_0==71||LA80_0==74||(LA80_0>=76 && LA80_0<=77)||LA80_0==79) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3098:1: (lv_body_4_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3098:1: (lv_body_4_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3099:3: lv_body_4_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeleteViewAccess().getBodyOperationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_4_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_4_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getDeleteViewAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteView"


    // $ANTLR start "entryRuleRemove"
    // InternalSiriusTextDsl.g:3127:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalSiriusTextDsl.g:3128:2: (iv_ruleRemove= ruleRemove EOF )
            // InternalSiriusTextDsl.g:3129:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalSiriusTextDsl.g:3136:1: ruleRemove returns [EObject current=null] : ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3139:28: ( ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? ) )
            // InternalSiriusTextDsl.g:3140:1: ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            {
            // InternalSiriusTextDsl.g:3140:1: ( () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )? )
            // InternalSiriusTextDsl.g:3140:2: () otherlv_1= 'remove' otherlv_2= '()' (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            {
            // InternalSiriusTextDsl.g:3140:2: ()
            // InternalSiriusTextDsl.g:3141:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRemoveAccess().getRemoveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FOLLOW_73); 

                	newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getRemoveKeyword_1());
                
            otherlv_2=(Token)match(input,75,FOLLOW_59); 

                	newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getLeftParenthesisRightParenthesisKeyword_2());
                
            // InternalSiriusTextDsl.g:3154:1: (otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==17) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalSiriusTextDsl.g:3154:3: otherlv_3= '{' ( (lv_body_4_0= ruleOperation ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_3, grammarAccess.getRemoveAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:3158:1: ( (lv_body_4_0= ruleOperation ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==36||LA82_0==57||(LA82_0>=59 && LA82_0<=60)||LA82_0==63||LA82_0==65||LA82_0==68||LA82_0==71||LA82_0==74||(LA82_0>=76 && LA82_0<=77)||LA82_0==79) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3159:1: (lv_body_4_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3159:1: (lv_body_4_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3160:3: lv_body_4_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRemoveAccess().getBodyOperationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_4_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRemoveRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_4_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_5, grammarAccess.getRemoveAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleMove"
    // InternalSiriusTextDsl.g:3188:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalSiriusTextDsl.g:3189:2: (iv_ruleMove= ruleMove EOF )
            // InternalSiriusTextDsl.g:3190:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalSiriusTextDsl.g:3197:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_newContainerExpression_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_featureName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3200:28: ( (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? ) )
            // InternalSiriusTextDsl.g:3201:1: (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            {
            // InternalSiriusTextDsl.g:3201:1: (otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )? )
            // InternalSiriusTextDsl.g:3201:3: otherlv_0= 'move' otherlv_1= '(' otherlv_2= 'newContainerExpression' otherlv_3= ':' ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= ',' otherlv_6= 'featureName' otherlv_7= ':' ( (lv_featureName_8_0= RULE_STRING ) ) otherlv_9= ')' (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_74); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_1());
                
            otherlv_2=(Token)match(input,78,FOLLOW_60); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getNewContainerExpressionKeyword_2());
                
            otherlv_3=(Token)match(input,58,FOLLOW_34); 

                	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getColonKeyword_3());
                
            // InternalSiriusTextDsl.g:3217:1: ( (lv_newContainerExpression_4_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3218:1: (lv_newContainerExpression_4_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3218:1: (lv_newContainerExpression_4_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3219:3: lv_newContainerExpression_4_0= RULE_EXPRESSION
            {
            lv_newContainerExpression_4_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_62); 

            			newLeafNode(lv_newContainerExpression_4_0, grammarAccess.getMoveAccess().getNewContainerExpressionEXPRESSIONTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"newContainerExpression",
                    		lv_newContainerExpression_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_61); 

                	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,61,FOLLOW_60); 

                	newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getFeatureNameKeyword_6());
                
            otherlv_7=(Token)match(input,58,FOLLOW_10); 

                	newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getColonKeyword_7());
                
            // InternalSiriusTextDsl.g:3247:1: ( (lv_featureName_8_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3248:1: (lv_featureName_8_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3248:1: (lv_featureName_8_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3249:3: lv_featureName_8_0= RULE_STRING
            {
            lv_featureName_8_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            			newLeafNode(lv_featureName_8_0, grammarAccess.getMoveAccess().getFeatureNameSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMoveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"featureName",
                    		lv_featureName_8_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_59); 

                	newLeafNode(otherlv_9, grammarAccess.getMoveAccess().getRightParenthesisKeyword_9());
                
            // InternalSiriusTextDsl.g:3269:1: (otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==17) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalSiriusTextDsl.g:3269:3: otherlv_10= '{' ( (lv_body_11_0= ruleOperation ) )* otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_58); 

                        	newLeafNode(otherlv_10, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_10_0());
                        
                    // InternalSiriusTextDsl.g:3273:1: ( (lv_body_11_0= ruleOperation ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==36||LA84_0==57||(LA84_0>=59 && LA84_0<=60)||LA84_0==63||LA84_0==65||LA84_0==68||LA84_0==71||LA84_0==74||(LA84_0>=76 && LA84_0<=77)||LA84_0==79) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:3274:1: (lv_body_11_0= ruleOperation )
                    	    {
                    	    // InternalSiriusTextDsl.g:3274:1: (lv_body_11_0= ruleOperation )
                    	    // InternalSiriusTextDsl.g:3275:3: lv_body_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMoveAccess().getBodyOperationParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_58);
                    	    lv_body_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMoveRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"body",
                    	            		lv_body_11_0, 
                    	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FOLLOW_2); 

                        	newLeafNode(otherlv_12, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_10_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSwitch"
    // InternalSiriusTextDsl.g:3303:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalSiriusTextDsl.g:3304:2: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalSiriusTextDsl.g:3305:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalSiriusTextDsl.g:3312:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_cases_2_0 = null;

        EObject lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3315:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' ) )
            // InternalSiriusTextDsl.g:3316:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            {
            // InternalSiriusTextDsl.g:3316:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}' )
            // InternalSiriusTextDsl.g:3316:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCase ) )+ ( (lv_default_3_0= ruleDefault ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_11); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_75); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
                
            // InternalSiriusTextDsl.g:3324:1: ( (lv_cases_2_0= ruleCase ) )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==80) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3325:1: (lv_cases_2_0= ruleCase )
            	    {
            	    // InternalSiriusTextDsl.g:3325:1: (lv_cases_2_0= ruleCase )
            	    // InternalSiriusTextDsl.g:3326:3: lv_cases_2_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchAccess().getCasesCaseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_76);
            	    lv_cases_2_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_2_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);

            // InternalSiriusTextDsl.g:3342:3: ( (lv_default_3_0= ruleDefault ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==81) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalSiriusTextDsl.g:3343:1: (lv_default_3_0= ruleDefault )
                    {
                    // InternalSiriusTextDsl.g:3343:1: (lv_default_3_0= ruleDefault )
                    // InternalSiriusTextDsl.g:3344:3: lv_default_3_0= ruleDefault
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultDefaultParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_23);
                    lv_default_3_0=ruleDefault();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_3_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Default");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleCase"
    // InternalSiriusTextDsl.g:3372:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalSiriusTextDsl.g:3373:2: (iv_ruleCase= ruleCase EOF )
            // InternalSiriusTextDsl.g:3374:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalSiriusTextDsl.g:3381:1: ruleCase returns [EObject current=null] : (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_conditionExpression_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3384:28: ( (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' ) )
            // InternalSiriusTextDsl.g:3385:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            {
            // InternalSiriusTextDsl.g:3385:1: (otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}' )
            // InternalSiriusTextDsl.g:3385:3: otherlv_0= 'case' otherlv_1= '(' ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleOperation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_34); 

                	newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:3393:1: ( (lv_conditionExpression_2_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:3394:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:3394:1: (lv_conditionExpression_2_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:3395:3: lv_conditionExpression_2_0= RULE_EXPRESSION
            {
            lv_conditionExpression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_14); 

            			newLeafNode(lv_conditionExpression_2_0, grammarAccess.getCaseAccess().getConditionExpressionEXPRESSIONTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionExpression",
                    		lv_conditionExpression_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_11); 

                	newLeafNode(otherlv_3, grammarAccess.getCaseAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_4, grammarAccess.getCaseAccess().getLeftCurlyBracketKeyword_4());
                
            // InternalSiriusTextDsl.g:3419:1: ( (lv_body_5_0= ruleOperation ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==36||LA88_0==57||(LA88_0>=59 && LA88_0<=60)||LA88_0==63||LA88_0==65||LA88_0==68||LA88_0==71||LA88_0==74||(LA88_0>=76 && LA88_0<=77)||LA88_0==79) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3420:1: (lv_body_5_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:3420:1: (lv_body_5_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:3421:3: lv_body_5_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getBodyOperationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_5_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_5_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_6, grammarAccess.getCaseAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleDefault"
    // InternalSiriusTextDsl.g:3449:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // InternalSiriusTextDsl.g:3450:2: (iv_ruleDefault= ruleDefault EOF )
            // InternalSiriusTextDsl.g:3451:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // InternalSiriusTextDsl.g:3458:1: ruleDefault returns [EObject current=null] : ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3461:28: ( ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' ) )
            // InternalSiriusTextDsl.g:3462:1: ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' )
            {
            // InternalSiriusTextDsl.g:3462:1: ( () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}' )
            // InternalSiriusTextDsl.g:3462:2: () otherlv_1= 'default' otherlv_2= '{' ( (lv_body_3_0= ruleOperation ) )* otherlv_4= '}'
            {
            // InternalSiriusTextDsl.g:3462:2: ()
            // InternalSiriusTextDsl.g:3463:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDefaultAccess().getDefaultAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_11); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getDefaultKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_58); 

                	newLeafNode(otherlv_2, grammarAccess.getDefaultAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalSiriusTextDsl.g:3476:1: ( (lv_body_3_0= ruleOperation ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==36||LA89_0==57||(LA89_0>=59 && LA89_0<=60)||LA89_0==63||LA89_0==65||LA89_0==68||LA89_0==71||LA89_0==74||(LA89_0>=76 && LA89_0<=77)||LA89_0==79) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3477:1: (lv_body_3_0= ruleOperation )
            	    {
            	    // InternalSiriusTextDsl.g:3477:1: (lv_body_3_0= ruleOperation )
            	    // InternalSiriusTextDsl.g:3478:3: lv_body_3_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDefaultAccess().getBodyOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_58);
            	    lv_body_3_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDefaultRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_3_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getDefaultAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleMapping"
    // InternalSiriusTextDsl.g:3506:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalSiriusTextDsl.g:3507:2: (iv_ruleMapping= ruleMapping EOF )
            // InternalSiriusTextDsl.g:3508:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalSiriusTextDsl.g:3515:1: ruleMapping returns [EObject current=null] : (this_Container_0= ruleContainer | this_Node_1= ruleNode ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Container_0 = null;

        EObject this_Node_1 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3518:28: ( (this_Container_0= ruleContainer | this_Node_1= ruleNode ) )
            // InternalSiriusTextDsl.g:3519:1: (this_Container_0= ruleContainer | this_Node_1= ruleNode )
            {
            // InternalSiriusTextDsl.g:3519:1: (this_Container_0= ruleContainer | this_Node_1= ruleNode )
            int alt90=2;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==86) ) {
                    alt90=1;
                }
                else if ( (LA90_1==82) ) {
                    alt90=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;
                }
                }
                break;
            case 86:
                {
                alt90=1;
                }
                break;
            case 82:
                {
                alt90=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalSiriusTextDsl.g:3520:5: this_Container_0= ruleContainer
                    {
                     
                            newCompositeNode(grammarAccess.getMappingAccess().getContainerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Container_0=ruleContainer();

                    state._fsp--;

                     
                            current = this_Container_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:3530:5: this_Node_1= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getMappingAccess().getNodeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_Node_1=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleNode"
    // InternalSiriusTextDsl.g:3546:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSiriusTextDsl.g:3547:2: (iv_ruleNode= ruleNode EOF )
            // InternalSiriusTextDsl.g:3548:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSiriusTextDsl.g:3555:1: ruleNode returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'for' ( (lv_domainClass_6_0= RULE_STRING ) ) otherlv_7= 'style' ( ( ruleQualifiedName ) ) (otherlv_9= '?' ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) ) )? otherlv_11= '{' (otherlv_12= 'semanticCandidatesExpression' otherlv_13= '=' ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) ) )? (otherlv_15= 'associatedElementsExpression' otherlv_16= '=' ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration ) )* otherlv_19= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token lv_domainClass_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_preconditionExpression_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_semanticCandidatesExpression_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_associatedElementsExpression_17_0=null;
        Token otherlv_19=null;
        EObject lv_conditionalStyles_18_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3558:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'for' ( (lv_domainClass_6_0= RULE_STRING ) ) otherlv_7= 'style' ( ( ruleQualifiedName ) ) (otherlv_9= '?' ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) ) )? otherlv_11= '{' (otherlv_12= 'semanticCandidatesExpression' otherlv_13= '=' ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) ) )? (otherlv_15= 'associatedElementsExpression' otherlv_16= '=' ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration ) )* otherlv_19= '}' ) )
            // InternalSiriusTextDsl.g:3559:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'for' ( (lv_domainClass_6_0= RULE_STRING ) ) otherlv_7= 'style' ( ( ruleQualifiedName ) ) (otherlv_9= '?' ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) ) )? otherlv_11= '{' (otherlv_12= 'semanticCandidatesExpression' otherlv_13= '=' ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) ) )? (otherlv_15= 'associatedElementsExpression' otherlv_16= '=' ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration ) )* otherlv_19= '}' )
            {
            // InternalSiriusTextDsl.g:3559:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'for' ( (lv_domainClass_6_0= RULE_STRING ) ) otherlv_7= 'style' ( ( ruleQualifiedName ) ) (otherlv_9= '?' ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) ) )? otherlv_11= '{' (otherlv_12= 'semanticCandidatesExpression' otherlv_13= '=' ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) ) )? (otherlv_15= 'associatedElementsExpression' otherlv_16= '=' ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration ) )* otherlv_19= '}' )
            // InternalSiriusTextDsl.g:3559:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'for' ( (lv_domainClass_6_0= RULE_STRING ) ) otherlv_7= 'style' ( ( ruleQualifiedName ) ) (otherlv_9= '?' ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) ) )? otherlv_11= '{' (otherlv_12= 'semanticCandidatesExpression' otherlv_13= '=' ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) ) )? (otherlv_15= 'associatedElementsExpression' otherlv_16= '=' ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration ) )* otherlv_19= '}'
            {
            // InternalSiriusTextDsl.g:3559:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_DOCUMENTATION) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalSiriusTextDsl.g:3560:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:3560:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:3561:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_77); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getNodeAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // InternalSiriusTextDsl.g:3581:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:3582:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:3582:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:3583:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:3599:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==16) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalSiriusTextDsl.g:3599:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:3603:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:3604:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:3604:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:3605:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getNodeAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_10); 

                	newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getForKeyword_4());
                
            // InternalSiriusTextDsl.g:3625:1: ( (lv_domainClass_6_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3626:1: (lv_domainClass_6_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3626:1: (lv_domainClass_6_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3627:3: lv_domainClass_6_0= RULE_STRING
            {
            lv_domainClass_6_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

            			newLeafNode(lv_domainClass_6_0, grammarAccess.getNodeAccess().getDomainClassSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_6_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,83,FOLLOW_4); 

                	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getStyleKeyword_6());
                
            // InternalSiriusTextDsl.g:3647:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3648:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3648:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3649:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getStyleNodeStyleCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_33);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:3662:2: (otherlv_9= '?' ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==37) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalSiriusTextDsl.g:3662:4: otherlv_9= '?' ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_34); 

                        	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getQuestionMarkKeyword_8_0());
                        
                    // InternalSiriusTextDsl.g:3666:1: ( (lv_preconditionExpression_10_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3667:1: (lv_preconditionExpression_10_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3667:1: (lv_preconditionExpression_10_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3668:3: lv_preconditionExpression_10_0= RULE_EXPRESSION
                    {
                    lv_preconditionExpression_10_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_preconditionExpression_10_0, grammarAccess.getNodeAccess().getPreconditionExpressionEXPRESSIONTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preconditionExpression",
                            		lv_preconditionExpression_10_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_79); 

                	newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_9());
                
            // InternalSiriusTextDsl.g:3688:1: (otherlv_12= 'semanticCandidatesExpression' otherlv_13= '=' ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==84) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalSiriusTextDsl.g:3688:3: otherlv_12= 'semanticCandidatesExpression' otherlv_13= '=' ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) )
                    {
                    otherlv_12=(Token)match(input,84,FOLLOW_17); 

                        	newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getSemanticCandidatesExpressionKeyword_10_0());
                        
                    otherlv_13=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getEqualsSignKeyword_10_1());
                        
                    // InternalSiriusTextDsl.g:3696:1: ( (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3697:1: (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3697:1: (lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3698:3: lv_semanticCandidatesExpression_14_0= RULE_EXPRESSION
                    {
                    lv_semanticCandidatesExpression_14_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_80); 

                    			newLeafNode(lv_semanticCandidatesExpression_14_0, grammarAccess.getNodeAccess().getSemanticCandidatesExpressionEXPRESSIONTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"semanticCandidatesExpression",
                            		lv_semanticCandidatesExpression_14_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3714:4: (otherlv_15= 'associatedElementsExpression' otherlv_16= '=' ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==85) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalSiriusTextDsl.g:3714:6: otherlv_15= 'associatedElementsExpression' otherlv_16= '=' ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) )
                    {
                    otherlv_15=(Token)match(input,85,FOLLOW_17); 

                        	newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getAssociatedElementsExpressionKeyword_11_0());
                        
                    otherlv_16=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:3722:1: ( (lv_associatedElementsExpression_17_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3723:1: (lv_associatedElementsExpression_17_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3723:1: (lv_associatedElementsExpression_17_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3724:3: lv_associatedElementsExpression_17_0= RULE_EXPRESSION
                    {
                    lv_associatedElementsExpression_17_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_81); 

                    			newLeafNode(lv_associatedElementsExpression_17_0, grammarAccess.getNodeAccess().getAssociatedElementsExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"associatedElementsExpression",
                            		lv_associatedElementsExpression_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3740:4: ( (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==83) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3741:1: (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration )
            	    {
            	    // InternalSiriusTextDsl.g:3741:1: (lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration )
            	    // InternalSiriusTextDsl.g:3742:3: lv_conditionalStyles_18_0= ruleConditionalNodeStyleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getConditionalStylesConditionalNodeStyleDeclarationParserRuleCall_12_0()); 
            	    	    
            	    pushFollow(FOLLOW_81);
            	    lv_conditionalStyles_18_0=ruleConditionalNodeStyleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditionalStyles",
            	            		lv_conditionalStyles_18_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.ConditionalNodeStyleDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            otherlv_19=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleContainer"
    // InternalSiriusTextDsl.g:3770:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalSiriusTextDsl.g:3771:2: (iv_ruleContainer= ruleContainer EOF )
            // InternalSiriusTextDsl.g:3772:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalSiriusTextDsl.g:3779:1: ruleContainer returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'container' ( (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) ) )? (otherlv_16= 'associatedElementsExpression' otherlv_17= '=' ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_20= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        Token lv_domainClass_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_preconditionExpression_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_semanticCandidatesExpression_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_associatedElementsExpression_18_0=null;
        Token otherlv_20=null;
        Enumerator lv_childrenPresentation_2_0 = null;

        EObject lv_conditionalStyles_19_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:3782:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'container' ( (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) ) )? (otherlv_16= 'associatedElementsExpression' otherlv_17= '=' ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_20= '}' ) )
            // InternalSiriusTextDsl.g:3783:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'container' ( (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) ) )? (otherlv_16= 'associatedElementsExpression' otherlv_17= '=' ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_20= '}' )
            {
            // InternalSiriusTextDsl.g:3783:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'container' ( (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) ) )? (otherlv_16= 'associatedElementsExpression' otherlv_17= '=' ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_20= '}' )
            // InternalSiriusTextDsl.g:3783:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'container' ( (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation ) )? ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )? otherlv_6= 'for' ( (lv_domainClass_7_0= RULE_STRING ) ) otherlv_8= 'style' ( ( ruleQualifiedName ) ) (otherlv_10= '?' ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) ) )? otherlv_12= '{' (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) ) )? (otherlv_16= 'associatedElementsExpression' otherlv_17= '=' ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) ) )? ( (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration ) )* otherlv_20= '}'
            {
            // InternalSiriusTextDsl.g:3783:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_DOCUMENTATION) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalSiriusTextDsl.g:3784:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:3784:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:3785:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_82); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getContainerAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,86,FOLLOW_83); 

                	newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
                
            // InternalSiriusTextDsl.g:3805:1: ( (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=122 && LA98_0<=125)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalSiriusTextDsl.g:3806:1: (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation )
                    {
                    // InternalSiriusTextDsl.g:3806:1: (lv_childrenPresentation_2_0= ruleContainerChildrenPresentation )
                    // InternalSiriusTextDsl.g:3807:3: lv_childrenPresentation_2_0= ruleContainerChildrenPresentation
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getChildrenPresentationContainerChildrenPresentationEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_4);
                    lv_childrenPresentation_2_0=ruleContainerChildrenPresentation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"childrenPresentation",
                            		lv_childrenPresentation_2_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ContainerChildrenPresentation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3823:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:3824:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:3824:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:3825:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			newLeafNode(lv_name_3_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:3841:2: (otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==16) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalSiriusTextDsl.g:3841:4: otherlv_4= 'as' ( (lv_label_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getAsKeyword_4_0());
                        
                    // InternalSiriusTextDsl.g:3845:1: ( (lv_label_5_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:3846:1: (lv_label_5_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:3846:1: (lv_label_5_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:3847:3: lv_label_5_0= RULE_STRING
                    {
                    lv_label_5_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    			newLeafNode(lv_label_5_0, grammarAccess.getContainerAccess().getLabelSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_5_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,36,FOLLOW_10); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getForKeyword_5());
                
            // InternalSiriusTextDsl.g:3867:1: ( (lv_domainClass_7_0= RULE_STRING ) )
            // InternalSiriusTextDsl.g:3868:1: (lv_domainClass_7_0= RULE_STRING )
            {
            // InternalSiriusTextDsl.g:3868:1: (lv_domainClass_7_0= RULE_STRING )
            // InternalSiriusTextDsl.g:3869:3: lv_domainClass_7_0= RULE_STRING
            {
            lv_domainClass_7_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

            			newLeafNode(lv_domainClass_7_0, grammarAccess.getContainerAccess().getDomainClassSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"domainClass",
                    		lv_domainClass_7_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,83,FOLLOW_4); 

                	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getStyleKeyword_7());
                
            // InternalSiriusTextDsl.g:3889:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:3890:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:3890:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:3891:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getStyleContainerStyleCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_33);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:3904:2: (otherlv_10= '?' ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==37) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalSiriusTextDsl.g:3904:4: otherlv_10= '?' ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) )
                    {
                    otherlv_10=(Token)match(input,37,FOLLOW_34); 

                        	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getQuestionMarkKeyword_9_0());
                        
                    // InternalSiriusTextDsl.g:3908:1: ( (lv_preconditionExpression_11_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3909:1: (lv_preconditionExpression_11_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3909:1: (lv_preconditionExpression_11_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3910:3: lv_preconditionExpression_11_0= RULE_EXPRESSION
                    {
                    lv_preconditionExpression_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_preconditionExpression_11_0, grammarAccess.getContainerAccess().getPreconditionExpressionEXPRESSIONTerminalRuleCall_9_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preconditionExpression",
                            		lv_preconditionExpression_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_79); 

                	newLeafNode(otherlv_12, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_10());
                
            // InternalSiriusTextDsl.g:3930:1: (otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==84) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalSiriusTextDsl.g:3930:3: otherlv_13= 'semanticCandidatesExpression' otherlv_14= '=' ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) )
                    {
                    otherlv_13=(Token)match(input,84,FOLLOW_17); 

                        	newLeafNode(otherlv_13, grammarAccess.getContainerAccess().getSemanticCandidatesExpressionKeyword_11_0());
                        
                    otherlv_14=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainerAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:3938:1: ( (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3939:1: (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3939:1: (lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3940:3: lv_semanticCandidatesExpression_15_0= RULE_EXPRESSION
                    {
                    lv_semanticCandidatesExpression_15_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_80); 

                    			newLeafNode(lv_semanticCandidatesExpression_15_0, grammarAccess.getContainerAccess().getSemanticCandidatesExpressionEXPRESSIONTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"semanticCandidatesExpression",
                            		lv_semanticCandidatesExpression_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3956:4: (otherlv_16= 'associatedElementsExpression' otherlv_17= '=' ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==85) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalSiriusTextDsl.g:3956:6: otherlv_16= 'associatedElementsExpression' otherlv_17= '=' ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) )
                    {
                    otherlv_16=(Token)match(input,85,FOLLOW_17); 

                        	newLeafNode(otherlv_16, grammarAccess.getContainerAccess().getAssociatedElementsExpressionKeyword_12_0());
                        
                    otherlv_17=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_17, grammarAccess.getContainerAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:3964:1: ( (lv_associatedElementsExpression_18_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:3965:1: (lv_associatedElementsExpression_18_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:3965:1: (lv_associatedElementsExpression_18_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:3966:3: lv_associatedElementsExpression_18_0= RULE_EXPRESSION
                    {
                    lv_associatedElementsExpression_18_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_81); 

                    			newLeafNode(lv_associatedElementsExpression_18_0, grammarAccess.getContainerAccess().getAssociatedElementsExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"associatedElementsExpression",
                            		lv_associatedElementsExpression_18_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:3982:4: ( (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration ) )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==83) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:3983:1: (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration )
            	    {
            	    // InternalSiriusTextDsl.g:3983:1: (lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration )
            	    // InternalSiriusTextDsl.g:3984:3: lv_conditionalStyles_19_0= ruleConditionalContainerStyleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getConditionalStylesConditionalContainerStyleDeclarationParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FOLLOW_81);
            	    lv_conditionalStyles_19_0=ruleConditionalContainerStyleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditionalStyles",
            	            		lv_conditionalStyles_19_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.ConditionalContainerStyleDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_20, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_14());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleConditionalNodeStyleDeclaration"
    // InternalSiriusTextDsl.g:4012:1: entryRuleConditionalNodeStyleDeclaration returns [EObject current=null] : iv_ruleConditionalNodeStyleDeclaration= ruleConditionalNodeStyleDeclaration EOF ;
    public final EObject entryRuleConditionalNodeStyleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalNodeStyleDeclaration = null;


        try {
            // InternalSiriusTextDsl.g:4013:2: (iv_ruleConditionalNodeStyleDeclaration= ruleConditionalNodeStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:4014:2: iv_ruleConditionalNodeStyleDeclaration= ruleConditionalNodeStyleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getConditionalNodeStyleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalNodeStyleDeclaration=ruleConditionalNodeStyleDeclaration();

            state._fsp--;

             current =iv_ruleConditionalNodeStyleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalNodeStyleDeclaration"


    // $ANTLR start "ruleConditionalNodeStyleDeclaration"
    // InternalSiriusTextDsl.g:4021:1: ruleConditionalNodeStyleDeclaration returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) ;
    public final EObject ruleConditionalNodeStyleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_conditionalStyleExpression_3_0=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4024:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) )
            // InternalSiriusTextDsl.g:4025:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            {
            // InternalSiriusTextDsl.g:4025:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            // InternalSiriusTextDsl.g:4025:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalNodeStyleDeclarationAccess().getStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:4029:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4030:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4030:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4031:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalNodeStyleDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionalNodeStyleDeclarationAccess().getStyleNodeStyleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_84);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_34); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalNodeStyleDeclarationAccess().getIfKeyword_2());
                
            // InternalSiriusTextDsl.g:4048:1: ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:4049:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:4049:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:4050:3: lv_conditionalStyleExpression_3_0= RULE_EXPRESSION
            {
            lv_conditionalStyleExpression_3_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_2); 

            			newLeafNode(lv_conditionalStyleExpression_3_0, grammarAccess.getConditionalNodeStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalNodeStyleDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionalStyleExpression",
                    		lv_conditionalStyleExpression_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalNodeStyleDeclaration"


    // $ANTLR start "entryRuleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:4074:1: entryRuleConditionalContainerStyleDeclaration returns [EObject current=null] : iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF ;
    public final EObject entryRuleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalContainerStyleDeclaration = null;


        try {
            // InternalSiriusTextDsl.g:4075:2: (iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF )
            // InternalSiriusTextDsl.g:4076:2: iv_ruleConditionalContainerStyleDeclaration= ruleConditionalContainerStyleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalContainerStyleDeclaration=ruleConditionalContainerStyleDeclaration();

            state._fsp--;

             current =iv_ruleConditionalContainerStyleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalContainerStyleDeclaration"


    // $ANTLR start "ruleConditionalContainerStyleDeclaration"
    // InternalSiriusTextDsl.g:4083:1: ruleConditionalContainerStyleDeclaration returns [EObject current=null] : (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) ;
    public final EObject ruleConditionalContainerStyleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_conditionalStyleExpression_3_0=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4086:28: ( (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) ) )
            // InternalSiriusTextDsl.g:4087:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            {
            // InternalSiriusTextDsl.g:4087:1: (otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) ) )
            // InternalSiriusTextDsl.g:4087:3: otherlv_0= 'style' ( ( ruleQualifiedName ) ) otherlv_2= 'if' ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:4091:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4092:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4092:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4093:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConditionalContainerStyleDeclarationAccess().getStyleContainerStyleCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_84);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_34); 

                	newLeafNode(otherlv_2, grammarAccess.getConditionalContainerStyleDeclarationAccess().getIfKeyword_2());
                
            // InternalSiriusTextDsl.g:4110:1: ( (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:4111:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:4111:1: (lv_conditionalStyleExpression_3_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:4112:3: lv_conditionalStyleExpression_3_0= RULE_EXPRESSION
            {
            lv_conditionalStyleExpression_3_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_2); 

            			newLeafNode(lv_conditionalStyleExpression_3_0, grammarAccess.getConditionalContainerStyleDeclarationAccess().getConditionalStyleExpressionEXPRESSIONTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConditionalContainerStyleDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"conditionalStyleExpression",
                    		lv_conditionalStyleExpression_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalContainerStyleDeclaration"


    // $ANTLR start "entryRuleStyle"
    // InternalSiriusTextDsl.g:4136:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // InternalSiriusTextDsl.g:4137:2: (iv_ruleStyle= ruleStyle EOF )
            // InternalSiriusTextDsl.g:4138:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // InternalSiriusTextDsl.g:4145:1: ruleStyle returns [EObject current=null] : (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle | this_NodeStyle_2= ruleNodeStyle ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerStyle_0 = null;

        EObject this_EdgeStyle_1 = null;

        EObject this_NodeStyle_2 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4148:28: ( (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle | this_NodeStyle_2= ruleNodeStyle ) )
            // InternalSiriusTextDsl.g:4149:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle | this_NodeStyle_2= ruleNodeStyle )
            {
            // InternalSiriusTextDsl.g:4149:1: (this_ContainerStyle_0= ruleContainerStyle | this_EdgeStyle_1= ruleEdgeStyle | this_NodeStyle_2= ruleNodeStyle )
            int alt104=3;
            switch ( input.LA(1) ) {
            case RULE_DOCUMENTATION:
                {
                int LA104_1 = input.LA(2);

                if ( (LA104_1==101) ) {
                    alt104=1;
                }
                else if ( ((LA104_1>=87 && LA104_1<=89)) ) {
                    alt104=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 1, input);

                    throw nvae;
                }
                }
                break;
            case 101:
                {
                alt104=1;
                }
                break;
            case 112:
                {
                alt104=2;
                }
                break;
            case 87:
            case 88:
            case 89:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalSiriusTextDsl.g:4150:5: this_ContainerStyle_0= ruleContainerStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleAccess().getContainerStyleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ContainerStyle_0=ruleContainerStyle();

                    state._fsp--;

                     
                            current = this_ContainerStyle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:4160:5: this_EdgeStyle_1= ruleEdgeStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleAccess().getEdgeStyleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_EdgeStyle_1=ruleEdgeStyle();

                    state._fsp--;

                     
                            current = this_EdgeStyle_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:4170:5: this_NodeStyle_2= ruleNodeStyle
                    {
                     
                            newCompositeNode(grammarAccess.getStyleAccess().getNodeStyleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_NodeStyle_2=ruleNodeStyle();

                    state._fsp--;

                     
                            current = this_NodeStyle_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRuleNodeStyle"
    // InternalSiriusTextDsl.g:4186:1: entryRuleNodeStyle returns [EObject current=null] : iv_ruleNodeStyle= ruleNodeStyle EOF ;
    public final EObject entryRuleNodeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeStyle = null;


        try {
            // InternalSiriusTextDsl.g:4187:2: (iv_ruleNodeStyle= ruleNodeStyle EOF )
            // InternalSiriusTextDsl.g:4188:2: iv_ruleNodeStyle= ruleNodeStyle EOF
            {
             newCompositeNode(grammarAccess.getNodeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeStyle=ruleNodeStyle();

            state._fsp--;

             current =iv_ruleNodeStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeStyle"


    // $ANTLR start "ruleNodeStyle"
    // InternalSiriusTextDsl.g:4195:1: ruleNodeStyle returns [EObject current=null] : this_Square_0= ruleSquare ;
    public final EObject ruleNodeStyle() throws RecognitionException {
        EObject current = null;

        EObject this_Square_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4198:28: (this_Square_0= ruleSquare )
            // InternalSiriusTextDsl.g:4200:5: this_Square_0= ruleSquare
            {
             
                    newCompositeNode(grammarAccess.getNodeStyleAccess().getSquareParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Square_0=ruleSquare();

            state._fsp--;

             
                    current = this_Square_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeStyle"


    // $ANTLR start "entryRuleSquare"
    // InternalSiriusTextDsl.g:4216:1: entryRuleSquare returns [EObject current=null] : iv_ruleSquare= ruleSquare EOF ;
    public final EObject entryRuleSquare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquare = null;


        try {
            // InternalSiriusTextDsl.g:4217:2: (iv_ruleSquare= ruleSquare EOF )
            // InternalSiriusTextDsl.g:4218:2: iv_ruleSquare= ruleSquare EOF
            {
             newCompositeNode(grammarAccess.getSquareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquare=ruleSquare();

            state._fsp--;

             current =iv_ruleSquare; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquare"


    // $ANTLR start "ruleSquare"
    // InternalSiriusTextDsl.g:4225:1: ruleSquare returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' ) )? ( (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' ) )? otherlv_3= 'square' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_label_8_0= ruleLabel ) )? (otherlv_9= 'labelBorderStyle' otherlv_10= '=' ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) ) )? ( (lv_border_12_0= ruleBorder ) )? (otherlv_13= 'height' otherlv_14= '=' ( (lv_height_15_0= RULE_INT ) ) )? (otherlv_16= 'width' otherlv_17= '=' ( (lv_width_18_0= RULE_INT ) ) )? (otherlv_19= 'sizeComputationExpression' otherlv_20= '=' ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) ) )? (otherlv_22= 'tooltipExpression' otherlv_23= '=' ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) ) )? otherlv_25= '}' ) ;
    public final EObject ruleSquare() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token lv_allowVerticalResizing_1_0=null;
        Token lv_allowHorizontalResizing_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_height_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_width_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_sizeComputationExpression_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_tooltipExpression_24_0=null;
        Token otherlv_25=null;
        EObject lv_label_8_0 = null;

        Enumerator lv_labelBorderStyle_11_0 = null;

        EObject lv_border_12_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4228:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' ) )? ( (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' ) )? otherlv_3= 'square' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_label_8_0= ruleLabel ) )? (otherlv_9= 'labelBorderStyle' otherlv_10= '=' ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) ) )? ( (lv_border_12_0= ruleBorder ) )? (otherlv_13= 'height' otherlv_14= '=' ( (lv_height_15_0= RULE_INT ) ) )? (otherlv_16= 'width' otherlv_17= '=' ( (lv_width_18_0= RULE_INT ) ) )? (otherlv_19= 'sizeComputationExpression' otherlv_20= '=' ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) ) )? (otherlv_22= 'tooltipExpression' otherlv_23= '=' ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) ) )? otherlv_25= '}' ) )
            // InternalSiriusTextDsl.g:4229:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' ) )? ( (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' ) )? otherlv_3= 'square' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_label_8_0= ruleLabel ) )? (otherlv_9= 'labelBorderStyle' otherlv_10= '=' ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) ) )? ( (lv_border_12_0= ruleBorder ) )? (otherlv_13= 'height' otherlv_14= '=' ( (lv_height_15_0= RULE_INT ) ) )? (otherlv_16= 'width' otherlv_17= '=' ( (lv_width_18_0= RULE_INT ) ) )? (otherlv_19= 'sizeComputationExpression' otherlv_20= '=' ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) ) )? (otherlv_22= 'tooltipExpression' otherlv_23= '=' ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) ) )? otherlv_25= '}' )
            {
            // InternalSiriusTextDsl.g:4229:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' ) )? ( (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' ) )? otherlv_3= 'square' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_label_8_0= ruleLabel ) )? (otherlv_9= 'labelBorderStyle' otherlv_10= '=' ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) ) )? ( (lv_border_12_0= ruleBorder ) )? (otherlv_13= 'height' otherlv_14= '=' ( (lv_height_15_0= RULE_INT ) ) )? (otherlv_16= 'width' otherlv_17= '=' ( (lv_width_18_0= RULE_INT ) ) )? (otherlv_19= 'sizeComputationExpression' otherlv_20= '=' ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) ) )? (otherlv_22= 'tooltipExpression' otherlv_23= '=' ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) ) )? otherlv_25= '}' )
            // InternalSiriusTextDsl.g:4229:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? ( (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' ) )? ( (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' ) )? otherlv_3= 'square' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_label_8_0= ruleLabel ) )? (otherlv_9= 'labelBorderStyle' otherlv_10= '=' ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) ) )? ( (lv_border_12_0= ruleBorder ) )? (otherlv_13= 'height' otherlv_14= '=' ( (lv_height_15_0= RULE_INT ) ) )? (otherlv_16= 'width' otherlv_17= '=' ( (lv_width_18_0= RULE_INT ) ) )? (otherlv_19= 'sizeComputationExpression' otherlv_20= '=' ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) ) )? (otherlv_22= 'tooltipExpression' otherlv_23= '=' ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) ) )? otherlv_25= '}'
            {
            // InternalSiriusTextDsl.g:4229:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_DOCUMENTATION) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalSiriusTextDsl.g:4230:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:4230:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:4231:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_85); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getSquareAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSquareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4247:3: ( (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==87) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalSiriusTextDsl.g:4248:1: (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' )
                    {
                    // InternalSiriusTextDsl.g:4248:1: (lv_allowVerticalResizing_1_0= '@AllowVerticalResizing' )
                    // InternalSiriusTextDsl.g:4249:3: lv_allowVerticalResizing_1_0= '@AllowVerticalResizing'
                    {
                    lv_allowVerticalResizing_1_0=(Token)match(input,87,FOLLOW_86); 

                            newLeafNode(lv_allowVerticalResizing_1_0, grammarAccess.getSquareAccess().getAllowVerticalResizingAllowVerticalResizingKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSquareRule());
                    	        }
                           		setWithLastConsumed(current, "allowVerticalResizing", true, "@AllowVerticalResizing");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4262:3: ( (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==88) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalSiriusTextDsl.g:4263:1: (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' )
                    {
                    // InternalSiriusTextDsl.g:4263:1: (lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing' )
                    // InternalSiriusTextDsl.g:4264:3: lv_allowHorizontalResizing_2_0= '@AllowHorizontalResizing'
                    {
                    lv_allowHorizontalResizing_2_0=(Token)match(input,88,FOLLOW_87); 

                            newLeafNode(lv_allowHorizontalResizing_2_0, grammarAccess.getSquareAccess().getAllowHorizontalResizingAllowHorizontalResizingKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSquareRule());
                    	        }
                           		setWithLastConsumed(current, "allowHorizontalResizing", true, "@AllowHorizontalResizing");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,89,FOLLOW_4); 

                	newLeafNode(otherlv_3, grammarAccess.getSquareAccess().getSquareKeyword_3());
                
            // InternalSiriusTextDsl.g:4281:1: ( (lv_name_4_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4282:1: (lv_name_4_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4282:1: (lv_name_4_0= RULE_ID )
            // InternalSiriusTextDsl.g:4283:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_88); 

            			newLeafNode(lv_name_4_0, grammarAccess.getSquareAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSquareRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,90,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getSquareAccess().getInKeyword_5());
                
            // InternalSiriusTextDsl.g:4303:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4304:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4304:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4305:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSquareRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSquareAccess().getColorColorCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_89); 

                	newLeafNode(otherlv_7, grammarAccess.getSquareAccess().getLeftCurlyBracketKeyword_7());
                
            // InternalSiriusTextDsl.g:4322:1: ( (lv_label_8_0= ruleLabel ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==19||(LA108_0>=96 && LA108_0<=98)) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalSiriusTextDsl.g:4323:1: (lv_label_8_0= ruleLabel )
                    {
                    // InternalSiriusTextDsl.g:4323:1: (lv_label_8_0= ruleLabel )
                    // InternalSiriusTextDsl.g:4324:3: lv_label_8_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getSquareAccess().getLabelLabelParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_90);
                    lv_label_8_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSquareRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Label");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4340:3: (otherlv_9= 'labelBorderStyle' otherlv_10= '=' ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==91) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalSiriusTextDsl.g:4340:5: otherlv_9= 'labelBorderStyle' otherlv_10= '=' ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) )
                    {
                    otherlv_9=(Token)match(input,91,FOLLOW_17); 

                        	newLeafNode(otherlv_9, grammarAccess.getSquareAccess().getLabelBorderStyleKeyword_9_0());
                        
                    otherlv_10=(Token)match(input,23,FOLLOW_91); 

                        	newLeafNode(otherlv_10, grammarAccess.getSquareAccess().getEqualsSignKeyword_9_1());
                        
                    // InternalSiriusTextDsl.g:4348:1: ( (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle ) )
                    // InternalSiriusTextDsl.g:4349:1: (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle )
                    {
                    // InternalSiriusTextDsl.g:4349:1: (lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle )
                    // InternalSiriusTextDsl.g:4350:3: lv_labelBorderStyle_11_0= ruleNodeLabelBorderStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getSquareAccess().getLabelBorderStyleNodeLabelBorderStyleEnumRuleCall_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_92);
                    lv_labelBorderStyle_11_0=ruleNodeLabelBorderStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSquareRule());
                    	        }
                           		set(
                           			current, 
                           			"labelBorderStyle",
                            		lv_labelBorderStyle_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.NodeLabelBorderStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4366:4: ( (lv_border_12_0= ruleBorder ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==100) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalSiriusTextDsl.g:4367:1: (lv_border_12_0= ruleBorder )
                    {
                    // InternalSiriusTextDsl.g:4367:1: (lv_border_12_0= ruleBorder )
                    // InternalSiriusTextDsl.g:4368:3: lv_border_12_0= ruleBorder
                    {
                     
                    	        newCompositeNode(grammarAccess.getSquareAccess().getBorderBorderParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_93);
                    lv_border_12_0=ruleBorder();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSquareRule());
                    	        }
                           		set(
                           			current, 
                           			"border",
                            		lv_border_12_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Border");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4384:3: (otherlv_13= 'height' otherlv_14= '=' ( (lv_height_15_0= RULE_INT ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==92) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalSiriusTextDsl.g:4384:5: otherlv_13= 'height' otherlv_14= '=' ( (lv_height_15_0= RULE_INT ) )
                    {
                    otherlv_13=(Token)match(input,92,FOLLOW_17); 

                        	newLeafNode(otherlv_13, grammarAccess.getSquareAccess().getHeightKeyword_11_0());
                        
                    otherlv_14=(Token)match(input,23,FOLLOW_94); 

                        	newLeafNode(otherlv_14, grammarAccess.getSquareAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:4392:1: ( (lv_height_15_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:4393:1: (lv_height_15_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:4393:1: (lv_height_15_0= RULE_INT )
                    // InternalSiriusTextDsl.g:4394:3: lv_height_15_0= RULE_INT
                    {
                    lv_height_15_0=(Token)match(input,RULE_INT,FOLLOW_95); 

                    			newLeafNode(lv_height_15_0, grammarAccess.getSquareAccess().getHeightINTTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSquareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"height",
                            		lv_height_15_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4410:4: (otherlv_16= 'width' otherlv_17= '=' ( (lv_width_18_0= RULE_INT ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==93) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalSiriusTextDsl.g:4410:6: otherlv_16= 'width' otherlv_17= '=' ( (lv_width_18_0= RULE_INT ) )
                    {
                    otherlv_16=(Token)match(input,93,FOLLOW_17); 

                        	newLeafNode(otherlv_16, grammarAccess.getSquareAccess().getWidthKeyword_12_0());
                        
                    otherlv_17=(Token)match(input,23,FOLLOW_94); 

                        	newLeafNode(otherlv_17, grammarAccess.getSquareAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:4418:1: ( (lv_width_18_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:4419:1: (lv_width_18_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:4419:1: (lv_width_18_0= RULE_INT )
                    // InternalSiriusTextDsl.g:4420:3: lv_width_18_0= RULE_INT
                    {
                    lv_width_18_0=(Token)match(input,RULE_INT,FOLLOW_96); 

                    			newLeafNode(lv_width_18_0, grammarAccess.getSquareAccess().getWidthINTTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSquareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"width",
                            		lv_width_18_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4436:4: (otherlv_19= 'sizeComputationExpression' otherlv_20= '=' ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==94) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalSiriusTextDsl.g:4436:6: otherlv_19= 'sizeComputationExpression' otherlv_20= '=' ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) )
                    {
                    otherlv_19=(Token)match(input,94,FOLLOW_17); 

                        	newLeafNode(otherlv_19, grammarAccess.getSquareAccess().getSizeComputationExpressionKeyword_13_0());
                        
                    otherlv_20=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_20, grammarAccess.getSquareAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalSiriusTextDsl.g:4444:1: ( (lv_sizeComputationExpression_21_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4445:1: (lv_sizeComputationExpression_21_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4445:1: (lv_sizeComputationExpression_21_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4446:3: lv_sizeComputationExpression_21_0= RULE_EXPRESSION
                    {
                    lv_sizeComputationExpression_21_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_97); 

                    			newLeafNode(lv_sizeComputationExpression_21_0, grammarAccess.getSquareAccess().getSizeComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSquareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sizeComputationExpression",
                            		lv_sizeComputationExpression_21_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4462:4: (otherlv_22= 'tooltipExpression' otherlv_23= '=' ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==95) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalSiriusTextDsl.g:4462:6: otherlv_22= 'tooltipExpression' otherlv_23= '=' ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) )
                    {
                    otherlv_22=(Token)match(input,95,FOLLOW_17); 

                        	newLeafNode(otherlv_22, grammarAccess.getSquareAccess().getTooltipExpressionKeyword_14_0());
                        
                    otherlv_23=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_23, grammarAccess.getSquareAccess().getEqualsSignKeyword_14_1());
                        
                    // InternalSiriusTextDsl.g:4470:1: ( (lv_tooltipExpression_24_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4471:1: (lv_tooltipExpression_24_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4471:1: (lv_tooltipExpression_24_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4472:3: lv_tooltipExpression_24_0= RULE_EXPRESSION
                    {
                    lv_tooltipExpression_24_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_23); 

                    			newLeafNode(lv_tooltipExpression_24_0, grammarAccess.getSquareAccess().getTooltipExpressionEXPRESSIONTerminalRuleCall_14_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSquareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tooltipExpression",
                            		lv_tooltipExpression_24_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_25, grammarAccess.getSquareAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquare"


    // $ANTLR start "entryRuleLabel"
    // InternalSiriusTextDsl.g:4500:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalSiriusTextDsl.g:4501:2: (iv_ruleLabel= ruleLabel EOF )
            // InternalSiriusTextDsl.g:4502:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalSiriusTextDsl.g:4509:1: ruleLabel returns [EObject current=null] : ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? ( (lv_hideByDefault_1_0= '@HideByDefault' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= 'label' ( (lv_formatOptions_6_0= ruleLabelFormatOption ) )* ( (lv_alignment_7_0= ruleLabelAlignment ) )? (otherlv_8= 'size' otherlv_9= '=' ( (lv_size_10_0= RULE_INT ) ) )? ( (lv_expression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_showIcon_0_0=null;
        Token lv_hideByDefault_1_0=null;
        Token otherlv_2=null;
        Token lv_iconPath_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_size_10_0=null;
        Token lv_expression_11_0=null;
        Token otherlv_12=null;
        Enumerator lv_formatOptions_6_0 = null;

        Enumerator lv_alignment_7_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4512:28: ( ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? ( (lv_hideByDefault_1_0= '@HideByDefault' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= 'label' ( (lv_formatOptions_6_0= ruleLabelFormatOption ) )* ( (lv_alignment_7_0= ruleLabelAlignment ) )? (otherlv_8= 'size' otherlv_9= '=' ( (lv_size_10_0= RULE_INT ) ) )? ( (lv_expression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) ) )
            // InternalSiriusTextDsl.g:4513:1: ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? ( (lv_hideByDefault_1_0= '@HideByDefault' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= 'label' ( (lv_formatOptions_6_0= ruleLabelFormatOption ) )* ( (lv_alignment_7_0= ruleLabelAlignment ) )? (otherlv_8= 'size' otherlv_9= '=' ( (lv_size_10_0= RULE_INT ) ) )? ( (lv_expression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )
            {
            // InternalSiriusTextDsl.g:4513:1: ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? ( (lv_hideByDefault_1_0= '@HideByDefault' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= 'label' ( (lv_formatOptions_6_0= ruleLabelFormatOption ) )* ( (lv_alignment_7_0= ruleLabelAlignment ) )? (otherlv_8= 'size' otherlv_9= '=' ( (lv_size_10_0= RULE_INT ) ) )? ( (lv_expression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:4513:2: ( (lv_showIcon_0_0= '@ShowIcon' ) )? ( (lv_hideByDefault_1_0= '@HideByDefault' ) )? (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )? otherlv_5= 'label' ( (lv_formatOptions_6_0= ruleLabelFormatOption ) )* ( (lv_alignment_7_0= ruleLabelAlignment ) )? (otherlv_8= 'size' otherlv_9= '=' ( (lv_size_10_0= RULE_INT ) ) )? ( (lv_expression_11_0= RULE_EXPRESSION ) ) otherlv_12= 'in' ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:4513:2: ( (lv_showIcon_0_0= '@ShowIcon' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==96) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalSiriusTextDsl.g:4514:1: (lv_showIcon_0_0= '@ShowIcon' )
                    {
                    // InternalSiriusTextDsl.g:4514:1: (lv_showIcon_0_0= '@ShowIcon' )
                    // InternalSiriusTextDsl.g:4515:3: lv_showIcon_0_0= '@ShowIcon'
                    {
                    lv_showIcon_0_0=(Token)match(input,96,FOLLOW_98); 

                            newLeafNode(lv_showIcon_0_0, grammarAccess.getLabelAccess().getShowIconShowIconKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "showIcon", true, "@ShowIcon");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4528:3: ( (lv_hideByDefault_1_0= '@HideByDefault' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==97) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalSiriusTextDsl.g:4529:1: (lv_hideByDefault_1_0= '@HideByDefault' )
                    {
                    // InternalSiriusTextDsl.g:4529:1: (lv_hideByDefault_1_0= '@HideByDefault' )
                    // InternalSiriusTextDsl.g:4530:3: lv_hideByDefault_1_0= '@HideByDefault'
                    {
                    lv_hideByDefault_1_0=(Token)match(input,97,FOLLOW_99); 

                            newLeafNode(lv_hideByDefault_1_0, grammarAccess.getLabelAccess().getHideByDefaultHideByDefaultKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(current, "hideByDefault", true, "@HideByDefault");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4543:3: (otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')' )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==19) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalSiriusTextDsl.g:4543:5: otherlv_2= '@IconPath(' ( (lv_iconPath_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_10); 

                        	newLeafNode(otherlv_2, grammarAccess.getLabelAccess().getIconPathKeyword_2_0());
                        
                    // InternalSiriusTextDsl.g:4547:1: ( (lv_iconPath_3_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:4548:1: (lv_iconPath_3_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:4548:1: (lv_iconPath_3_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:4549:3: lv_iconPath_3_0= RULE_STRING
                    {
                    lv_iconPath_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_iconPath_3_0, grammarAccess.getLabelAccess().getIconPathSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"iconPath",
                            		lv_iconPath_3_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_100); 

                        	newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,98,FOLLOW_101); 

                	newLeafNode(otherlv_5, grammarAccess.getLabelAccess().getLabelKeyword_3());
                
            // InternalSiriusTextDsl.g:4573:1: ( (lv_formatOptions_6_0= ruleLabelFormatOption ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( ((LA118_0>=126 && LA118_0<=129)) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:4574:1: (lv_formatOptions_6_0= ruleLabelFormatOption )
            	    {
            	    // InternalSiriusTextDsl.g:4574:1: (lv_formatOptions_6_0= ruleLabelFormatOption )
            	    // InternalSiriusTextDsl.g:4575:3: lv_formatOptions_6_0= ruleLabelFormatOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelAccess().getFormatOptionsLabelFormatOptionEnumRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_101);
            	    lv_formatOptions_6_0=ruleLabelFormatOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"formatOptions",
            	            		lv_formatOptions_6_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.LabelFormatOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);

            // InternalSiriusTextDsl.g:4591:3: ( (lv_alignment_7_0= ruleLabelAlignment ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( ((LA119_0>=130 && LA119_0<=132)) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalSiriusTextDsl.g:4592:1: (lv_alignment_7_0= ruleLabelAlignment )
                    {
                    // InternalSiriusTextDsl.g:4592:1: (lv_alignment_7_0= ruleLabelAlignment )
                    // InternalSiriusTextDsl.g:4593:3: lv_alignment_7_0= ruleLabelAlignment
                    {
                     
                    	        newCompositeNode(grammarAccess.getLabelAccess().getAlignmentLabelAlignmentEnumRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_102);
                    lv_alignment_7_0=ruleLabelAlignment();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLabelRule());
                    	        }
                           		set(
                           			current, 
                           			"alignment",
                            		lv_alignment_7_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.LabelAlignment");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4609:3: (otherlv_8= 'size' otherlv_9= '=' ( (lv_size_10_0= RULE_INT ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==99) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalSiriusTextDsl.g:4609:5: otherlv_8= 'size' otherlv_9= '=' ( (lv_size_10_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,99,FOLLOW_17); 

                        	newLeafNode(otherlv_8, grammarAccess.getLabelAccess().getSizeKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,23,FOLLOW_94); 

                        	newLeafNode(otherlv_9, grammarAccess.getLabelAccess().getEqualsSignKeyword_6_1());
                        
                    // InternalSiriusTextDsl.g:4617:1: ( (lv_size_10_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:4618:1: (lv_size_10_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:4618:1: (lv_size_10_0= RULE_INT )
                    // InternalSiriusTextDsl.g:4619:3: lv_size_10_0= RULE_INT
                    {
                    lv_size_10_0=(Token)match(input,RULE_INT,FOLLOW_34); 

                    			newLeafNode(lv_size_10_0, grammarAccess.getLabelAccess().getSizeINTTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_10_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4635:4: ( (lv_expression_11_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:4636:1: (lv_expression_11_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:4636:1: (lv_expression_11_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:4637:3: lv_expression_11_0= RULE_EXPRESSION
            {
            lv_expression_11_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_88); 

            			newLeafNode(lv_expression_11_0, grammarAccess.getLabelAccess().getExpressionEXPRESSIONTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_11_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_12=(Token)match(input,90,FOLLOW_4); 

                	newLeafNode(otherlv_12, grammarAccess.getLabelAccess().getInKeyword_8());
                
            // InternalSiriusTextDsl.g:4657:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4658:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4658:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4659:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLabelAccess().getColorColorCrossReference_9_0()); 
            	    
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleBorder"
    // InternalSiriusTextDsl.g:4680:1: entryRuleBorder returns [EObject current=null] : iv_ruleBorder= ruleBorder EOF ;
    public final EObject entryRuleBorder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBorder = null;


        try {
            // InternalSiriusTextDsl.g:4681:2: (iv_ruleBorder= ruleBorder EOF )
            // InternalSiriusTextDsl.g:4682:2: iv_ruleBorder= ruleBorder EOF
            {
             newCompositeNode(grammarAccess.getBorderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBorder=ruleBorder();

            state._fsp--;

             current =iv_ruleBorder; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBorder"


    // $ANTLR start "ruleBorder"
    // InternalSiriusTextDsl.g:4689:1: ruleBorder returns [EObject current=null] : (otherlv_0= 'border' ( (lv_lineStyle_1_0= ruleLineStyle ) ) otherlv_2= 'size' otherlv_3= '=' ( (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleBorder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_borderSizeComputationExpression_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_lineStyle_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4692:28: ( (otherlv_0= 'border' ( (lv_lineStyle_1_0= ruleLineStyle ) ) otherlv_2= 'size' otherlv_3= '=' ( (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) ) )
            // InternalSiriusTextDsl.g:4693:1: (otherlv_0= 'border' ( (lv_lineStyle_1_0= ruleLineStyle ) ) otherlv_2= 'size' otherlv_3= '=' ( (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) )
            {
            // InternalSiriusTextDsl.g:4693:1: (otherlv_0= 'border' ( (lv_lineStyle_1_0= ruleLineStyle ) ) otherlv_2= 'size' otherlv_3= '=' ( (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:4693:3: otherlv_0= 'border' ( (lv_lineStyle_1_0= ruleLineStyle ) ) otherlv_2= 'size' otherlv_3= '=' ( (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION ) ) otherlv_5= 'in' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,100,FOLLOW_103); 

                	newLeafNode(otherlv_0, grammarAccess.getBorderAccess().getBorderKeyword_0());
                
            // InternalSiriusTextDsl.g:4697:1: ( (lv_lineStyle_1_0= ruleLineStyle ) )
            // InternalSiriusTextDsl.g:4698:1: (lv_lineStyle_1_0= ruleLineStyle )
            {
            // InternalSiriusTextDsl.g:4698:1: (lv_lineStyle_1_0= ruleLineStyle )
            // InternalSiriusTextDsl.g:4699:3: lv_lineStyle_1_0= ruleLineStyle
            {
             
            	        newCompositeNode(grammarAccess.getBorderAccess().getLineStyleLineStyleEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_104);
            lv_lineStyle_1_0=ruleLineStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBorderRule());
            	        }
                   		set(
                   			current, 
                   			"lineStyle",
                    		lv_lineStyle_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.LineStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,99,FOLLOW_17); 

                	newLeafNode(otherlv_2, grammarAccess.getBorderAccess().getSizeKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_34); 

                	newLeafNode(otherlv_3, grammarAccess.getBorderAccess().getEqualsSignKeyword_3());
                
            // InternalSiriusTextDsl.g:4723:1: ( (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:4724:1: (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:4724:1: (lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:4725:3: lv_borderSizeComputationExpression_4_0= RULE_EXPRESSION
            {
            lv_borderSizeComputationExpression_4_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_88); 

            			newLeafNode(lv_borderSizeComputationExpression_4_0, grammarAccess.getBorderAccess().getBorderSizeComputationExpressionEXPRESSIONTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBorderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"borderSizeComputationExpression",
                    		lv_borderSizeComputationExpression_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_5=(Token)match(input,90,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getBorderAccess().getInKeyword_5());
                
            // InternalSiriusTextDsl.g:4745:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4746:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4746:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4747:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBorderRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBorderAccess().getBorderColorColorCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBorder"


    // $ANTLR start "entryRuleContainerStyle"
    // InternalSiriusTextDsl.g:4768:1: entryRuleContainerStyle returns [EObject current=null] : iv_ruleContainerStyle= ruleContainerStyle EOF ;
    public final EObject entryRuleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerStyle = null;


        try {
            // InternalSiriusTextDsl.g:4769:2: (iv_ruleContainerStyle= ruleContainerStyle EOF )
            // InternalSiriusTextDsl.g:4770:2: iv_ruleContainerStyle= ruleContainerStyle EOF
            {
             newCompositeNode(grammarAccess.getContainerStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerStyle=ruleContainerStyle();

            state._fsp--;

             current =iv_ruleContainerStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerStyle"


    // $ANTLR start "ruleContainerStyle"
    // InternalSiriusTextDsl.g:4777:1: ruleContainerStyle returns [EObject current=null] : this_Gradient_0= ruleGradient ;
    public final EObject ruleContainerStyle() throws RecognitionException {
        EObject current = null;

        EObject this_Gradient_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4780:28: (this_Gradient_0= ruleGradient )
            // InternalSiriusTextDsl.g:4782:5: this_Gradient_0= ruleGradient
            {
             
                    newCompositeNode(grammarAccess.getContainerStyleAccess().getGradientParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_Gradient_0=ruleGradient();

            state._fsp--;

             
                    current = this_Gradient_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerStyle"


    // $ANTLR start "entryRuleGradient"
    // InternalSiriusTextDsl.g:4798:1: entryRuleGradient returns [EObject current=null] : iv_ruleGradient= ruleGradient EOF ;
    public final EObject entryRuleGradient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGradient = null;


        try {
            // InternalSiriusTextDsl.g:4799:2: (iv_ruleGradient= ruleGradient EOF )
            // InternalSiriusTextDsl.g:4800:2: iv_ruleGradient= ruleGradient EOF
            {
             newCompositeNode(grammarAccess.getGradientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGradient=ruleGradient();

            state._fsp--;

             current =iv_ruleGradient; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGradient"


    // $ANTLR start "ruleGradient"
    // InternalSiriusTextDsl.g:4807:1: ruleGradient returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_label_9_0= ruleLabel ) )? (otherlv_10= 'labelBorderStyle' otherlv_11= '=' ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) ) )? ( (lv_border_13_0= ruleBorder ) )? (otherlv_14= 'heightComputationExpression' otherlv_15= '=' ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) ) )? (otherlv_17= 'widthComputationExpression' otherlv_18= '=' ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'arcHeight' otherlv_21= '=' ( (lv_arcHeight_22_0= RULE_INT ) ) )? (otherlv_23= 'arcWidth' otherlv_24= '=' ( (lv_arcWidth_25_0= RULE_INT ) ) )? (otherlv_26= 'tooltipExpression' otherlv_27= '=' ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleGradient() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_heightComputationExpression_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_widthComputationExpression_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_arcHeight_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_arcWidth_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_tooltipExpression_28_0=null;
        Token otherlv_29=null;
        Enumerator lv_direction_2_0 = null;

        EObject lv_label_9_0 = null;

        Enumerator lv_labelBorderStyle_12_0 = null;

        EObject lv_border_13_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:4810:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_label_9_0= ruleLabel ) )? (otherlv_10= 'labelBorderStyle' otherlv_11= '=' ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) ) )? ( (lv_border_13_0= ruleBorder ) )? (otherlv_14= 'heightComputationExpression' otherlv_15= '=' ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) ) )? (otherlv_17= 'widthComputationExpression' otherlv_18= '=' ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'arcHeight' otherlv_21= '=' ( (lv_arcHeight_22_0= RULE_INT ) ) )? (otherlv_23= 'arcWidth' otherlv_24= '=' ( (lv_arcWidth_25_0= RULE_INT ) ) )? (otherlv_26= 'tooltipExpression' otherlv_27= '=' ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' ) )
            // InternalSiriusTextDsl.g:4811:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_label_9_0= ruleLabel ) )? (otherlv_10= 'labelBorderStyle' otherlv_11= '=' ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) ) )? ( (lv_border_13_0= ruleBorder ) )? (otherlv_14= 'heightComputationExpression' otherlv_15= '=' ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) ) )? (otherlv_17= 'widthComputationExpression' otherlv_18= '=' ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'arcHeight' otherlv_21= '=' ( (lv_arcHeight_22_0= RULE_INT ) ) )? (otherlv_23= 'arcWidth' otherlv_24= '=' ( (lv_arcWidth_25_0= RULE_INT ) ) )? (otherlv_26= 'tooltipExpression' otherlv_27= '=' ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            {
            // InternalSiriusTextDsl.g:4811:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_label_9_0= ruleLabel ) )? (otherlv_10= 'labelBorderStyle' otherlv_11= '=' ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) ) )? ( (lv_border_13_0= ruleBorder ) )? (otherlv_14= 'heightComputationExpression' otherlv_15= '=' ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) ) )? (otherlv_17= 'widthComputationExpression' otherlv_18= '=' ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'arcHeight' otherlv_21= '=' ( (lv_arcHeight_22_0= RULE_INT ) ) )? (otherlv_23= 'arcWidth' otherlv_24= '=' ( (lv_arcWidth_25_0= RULE_INT ) ) )? (otherlv_26= 'tooltipExpression' otherlv_27= '=' ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}' )
            // InternalSiriusTextDsl.g:4811:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'gradient' ( (lv_direction_2_0= ruleGradientDirection ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_label_9_0= ruleLabel ) )? (otherlv_10= 'labelBorderStyle' otherlv_11= '=' ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) ) )? ( (lv_border_13_0= ruleBorder ) )? (otherlv_14= 'heightComputationExpression' otherlv_15= '=' ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) ) )? (otherlv_17= 'widthComputationExpression' otherlv_18= '=' ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) ) )? (otherlv_20= 'arcHeight' otherlv_21= '=' ( (lv_arcHeight_22_0= RULE_INT ) ) )? (otherlv_23= 'arcWidth' otherlv_24= '=' ( (lv_arcWidth_25_0= RULE_INT ) ) )? (otherlv_26= 'tooltipExpression' otherlv_27= '=' ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) ) )? otherlv_29= '}'
            {
            // InternalSiriusTextDsl.g:4811:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==RULE_DOCUMENTATION) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalSiriusTextDsl.g:4812:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:4812:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:4813:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_105); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getGradientAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,101,FOLLOW_106); 

                	newLeafNode(otherlv_1, grammarAccess.getGradientAccess().getGradientKeyword_1());
                
            // InternalSiriusTextDsl.g:4833:1: ( (lv_direction_2_0= ruleGradientDirection ) )
            // InternalSiriusTextDsl.g:4834:1: (lv_direction_2_0= ruleGradientDirection )
            {
            // InternalSiriusTextDsl.g:4834:1: (lv_direction_2_0= ruleGradientDirection )
            // InternalSiriusTextDsl.g:4835:3: lv_direction_2_0= ruleGradientDirection
            {
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getDirectionGradientDirectionEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_4);
            lv_direction_2_0=ruleGradientDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGradientRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.GradientDirection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:4851:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:4852:1: (lv_name_3_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:4852:1: (lv_name_3_0= RULE_ID )
            // InternalSiriusTextDsl.g:4853:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_107); 

            			newLeafNode(lv_name_3_0, grammarAccess.getGradientAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,102,FOLLOW_4); 

                	newLeafNode(otherlv_4, grammarAccess.getGradientAccess().getFromKeyword_4());
                
            // InternalSiriusTextDsl.g:4873:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4874:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4874:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4875:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getBackgroundColorColorCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_108);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,103,FOLLOW_4); 

                	newLeafNode(otherlv_6, grammarAccess.getGradientAccess().getToKeyword_6());
                
            // InternalSiriusTextDsl.g:4892:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:4893:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:4893:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:4894:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGradientRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGradientAccess().getForegroundColorColorCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_109); 

                	newLeafNode(otherlv_8, grammarAccess.getGradientAccess().getLeftCurlyBracketKeyword_8());
                
            // InternalSiriusTextDsl.g:4911:1: ( (lv_label_9_0= ruleLabel ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==19||(LA122_0>=96 && LA122_0<=98)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalSiriusTextDsl.g:4912:1: (lv_label_9_0= ruleLabel )
                    {
                    // InternalSiriusTextDsl.g:4912:1: (lv_label_9_0= ruleLabel )
                    // InternalSiriusTextDsl.g:4913:3: lv_label_9_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelLabelParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_110);
                    lv_label_9_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGradientRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_9_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Label");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4929:3: (otherlv_10= 'labelBorderStyle' otherlv_11= '=' ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==91) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalSiriusTextDsl.g:4929:5: otherlv_10= 'labelBorderStyle' otherlv_11= '=' ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) )
                    {
                    otherlv_10=(Token)match(input,91,FOLLOW_17); 

                        	newLeafNode(otherlv_10, grammarAccess.getGradientAccess().getLabelBorderStyleKeyword_10_0());
                        
                    otherlv_11=(Token)match(input,23,FOLLOW_111); 

                        	newLeafNode(otherlv_11, grammarAccess.getGradientAccess().getEqualsSignKeyword_10_1());
                        
                    // InternalSiriusTextDsl.g:4937:1: ( (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle ) )
                    // InternalSiriusTextDsl.g:4938:1: (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle )
                    {
                    // InternalSiriusTextDsl.g:4938:1: (lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle )
                    // InternalSiriusTextDsl.g:4939:3: lv_labelBorderStyle_12_0= ruleContainerLabelBorderStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getLabelBorderStyleContainerLabelBorderStyleEnumRuleCall_10_2_0()); 
                    	    
                    pushFollow(FOLLOW_112);
                    lv_labelBorderStyle_12_0=ruleContainerLabelBorderStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGradientRule());
                    	        }
                           		set(
                           			current, 
                           			"labelBorderStyle",
                            		lv_labelBorderStyle_12_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ContainerLabelBorderStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4955:4: ( (lv_border_13_0= ruleBorder ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==100) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalSiriusTextDsl.g:4956:1: (lv_border_13_0= ruleBorder )
                    {
                    // InternalSiriusTextDsl.g:4956:1: (lv_border_13_0= ruleBorder )
                    // InternalSiriusTextDsl.g:4957:3: lv_border_13_0= ruleBorder
                    {
                     
                    	        newCompositeNode(grammarAccess.getGradientAccess().getBorderBorderParserRuleCall_11_0()); 
                    	    
                    pushFollow(FOLLOW_113);
                    lv_border_13_0=ruleBorder();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGradientRule());
                    	        }
                           		set(
                           			current, 
                           			"border",
                            		lv_border_13_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.Border");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4973:3: (otherlv_14= 'heightComputationExpression' otherlv_15= '=' ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==104) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalSiriusTextDsl.g:4973:5: otherlv_14= 'heightComputationExpression' otherlv_15= '=' ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) )
                    {
                    otherlv_14=(Token)match(input,104,FOLLOW_17); 

                        	newLeafNode(otherlv_14, grammarAccess.getGradientAccess().getHeightComputationExpressionKeyword_12_0());
                        
                    otherlv_15=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_15, grammarAccess.getGradientAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:4981:1: ( (lv_heightComputationExpression_16_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:4982:1: (lv_heightComputationExpression_16_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:4982:1: (lv_heightComputationExpression_16_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:4983:3: lv_heightComputationExpression_16_0= RULE_EXPRESSION
                    {
                    lv_heightComputationExpression_16_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_114); 

                    			newLeafNode(lv_heightComputationExpression_16_0, grammarAccess.getGradientAccess().getHeightComputationExpressionEXPRESSIONTerminalRuleCall_12_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"heightComputationExpression",
                            		lv_heightComputationExpression_16_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:4999:4: (otherlv_17= 'widthComputationExpression' otherlv_18= '=' ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==105) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalSiriusTextDsl.g:4999:6: otherlv_17= 'widthComputationExpression' otherlv_18= '=' ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) )
                    {
                    otherlv_17=(Token)match(input,105,FOLLOW_17); 

                        	newLeafNode(otherlv_17, grammarAccess.getGradientAccess().getWidthComputationExpressionKeyword_13_0());
                        
                    otherlv_18=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_18, grammarAccess.getGradientAccess().getEqualsSignKeyword_13_1());
                        
                    // InternalSiriusTextDsl.g:5007:1: ( (lv_widthComputationExpression_19_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:5008:1: (lv_widthComputationExpression_19_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:5008:1: (lv_widthComputationExpression_19_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:5009:3: lv_widthComputationExpression_19_0= RULE_EXPRESSION
                    {
                    lv_widthComputationExpression_19_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_115); 

                    			newLeafNode(lv_widthComputationExpression_19_0, grammarAccess.getGradientAccess().getWidthComputationExpressionEXPRESSIONTerminalRuleCall_13_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"widthComputationExpression",
                            		lv_widthComputationExpression_19_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5025:4: (otherlv_20= 'arcHeight' otherlv_21= '=' ( (lv_arcHeight_22_0= RULE_INT ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==106) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalSiriusTextDsl.g:5025:6: otherlv_20= 'arcHeight' otherlv_21= '=' ( (lv_arcHeight_22_0= RULE_INT ) )
                    {
                    otherlv_20=(Token)match(input,106,FOLLOW_17); 

                        	newLeafNode(otherlv_20, grammarAccess.getGradientAccess().getArcHeightKeyword_14_0());
                        
                    otherlv_21=(Token)match(input,23,FOLLOW_94); 

                        	newLeafNode(otherlv_21, grammarAccess.getGradientAccess().getEqualsSignKeyword_14_1());
                        
                    // InternalSiriusTextDsl.g:5033:1: ( (lv_arcHeight_22_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:5034:1: (lv_arcHeight_22_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:5034:1: (lv_arcHeight_22_0= RULE_INT )
                    // InternalSiriusTextDsl.g:5035:3: lv_arcHeight_22_0= RULE_INT
                    {
                    lv_arcHeight_22_0=(Token)match(input,RULE_INT,FOLLOW_116); 

                    			newLeafNode(lv_arcHeight_22_0, grammarAccess.getGradientAccess().getArcHeightINTTerminalRuleCall_14_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arcHeight",
                            		lv_arcHeight_22_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5051:4: (otherlv_23= 'arcWidth' otherlv_24= '=' ( (lv_arcWidth_25_0= RULE_INT ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==107) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalSiriusTextDsl.g:5051:6: otherlv_23= 'arcWidth' otherlv_24= '=' ( (lv_arcWidth_25_0= RULE_INT ) )
                    {
                    otherlv_23=(Token)match(input,107,FOLLOW_17); 

                        	newLeafNode(otherlv_23, grammarAccess.getGradientAccess().getArcWidthKeyword_15_0());
                        
                    otherlv_24=(Token)match(input,23,FOLLOW_94); 

                        	newLeafNode(otherlv_24, grammarAccess.getGradientAccess().getEqualsSignKeyword_15_1());
                        
                    // InternalSiriusTextDsl.g:5059:1: ( (lv_arcWidth_25_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:5060:1: (lv_arcWidth_25_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:5060:1: (lv_arcWidth_25_0= RULE_INT )
                    // InternalSiriusTextDsl.g:5061:3: lv_arcWidth_25_0= RULE_INT
                    {
                    lv_arcWidth_25_0=(Token)match(input,RULE_INT,FOLLOW_97); 

                    			newLeafNode(lv_arcWidth_25_0, grammarAccess.getGradientAccess().getArcWidthINTTerminalRuleCall_15_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"arcWidth",
                            		lv_arcWidth_25_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5077:4: (otherlv_26= 'tooltipExpression' otherlv_27= '=' ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==95) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalSiriusTextDsl.g:5077:6: otherlv_26= 'tooltipExpression' otherlv_27= '=' ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) )
                    {
                    otherlv_26=(Token)match(input,95,FOLLOW_17); 

                        	newLeafNode(otherlv_26, grammarAccess.getGradientAccess().getTooltipExpressionKeyword_16_0());
                        
                    otherlv_27=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_27, grammarAccess.getGradientAccess().getEqualsSignKeyword_16_1());
                        
                    // InternalSiriusTextDsl.g:5085:1: ( (lv_tooltipExpression_28_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:5086:1: (lv_tooltipExpression_28_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:5086:1: (lv_tooltipExpression_28_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:5087:3: lv_tooltipExpression_28_0= RULE_EXPRESSION
                    {
                    lv_tooltipExpression_28_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_23); 

                    			newLeafNode(lv_tooltipExpression_28_0, grammarAccess.getGradientAccess().getTooltipExpressionEXPRESSIONTerminalRuleCall_16_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGradientRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tooltipExpression",
                            		lv_tooltipExpression_28_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_29, grammarAccess.getGradientAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradient"


    // $ANTLR start "entryRuleEdge"
    // InternalSiriusTextDsl.g:5115:1: entryRuleEdge returns [EObject current=null] : iv_ruleEdge= ruleEdge EOF ;
    public final EObject entryRuleEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdge = null;


        try {
            // InternalSiriusTextDsl.g:5116:2: (iv_ruleEdge= ruleEdge EOF )
            // InternalSiriusTextDsl.g:5117:2: iv_ruleEdge= ruleEdge EOF
            {
             newCompositeNode(grammarAccess.getEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdge=ruleEdge();

            state._fsp--;

             current =iv_ruleEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdge"


    // $ANTLR start "ruleEdge"
    // InternalSiriusTextDsl.g:5124:1: ruleEdge returns [EObject current=null] : this_RelationBasedEdge_0= ruleRelationBasedEdge ;
    public final EObject ruleEdge() throws RecognitionException {
        EObject current = null;

        EObject this_RelationBasedEdge_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:5127:28: (this_RelationBasedEdge_0= ruleRelationBasedEdge )
            // InternalSiriusTextDsl.g:5129:5: this_RelationBasedEdge_0= ruleRelationBasedEdge
            {
             
                    newCompositeNode(grammarAccess.getEdgeAccess().getRelationBasedEdgeParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_RelationBasedEdge_0=ruleRelationBasedEdge();

            state._fsp--;

             
                    current = this_RelationBasedEdge_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdge"


    // $ANTLR start "entryRuleRelationBasedEdge"
    // InternalSiriusTextDsl.g:5145:1: entryRuleRelationBasedEdge returns [EObject current=null] : iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF ;
    public final EObject entryRuleRelationBasedEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationBasedEdge = null;


        try {
            // InternalSiriusTextDsl.g:5146:2: (iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF )
            // InternalSiriusTextDsl.g:5147:2: iv_ruleRelationBasedEdge= ruleRelationBasedEdge EOF
            {
             newCompositeNode(grammarAccess.getRelationBasedEdgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationBasedEdge=ruleRelationBasedEdge();

            state._fsp--;

             current =iv_ruleRelationBasedEdge; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationBasedEdge"


    // $ANTLR start "ruleRelationBasedEdge"
    // InternalSiriusTextDsl.g:5154:1: ruleRelationBasedEdge returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) (otherlv_7= '?' ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= '{' otherlv_10= 'sourceMappings' otherlv_11= '=' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' otherlv_17= 'targetMappings' otherlv_18= '=' otherlv_19= '[' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ']' otherlv_24= 'targetFinderExpression' otherlv_25= '=' ( (lv_targetFinderExpression_26_0= RULE_EXPRESSION ) ) otherlv_27= '}' ) ;
    public final EObject ruleRelationBasedEdge() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_preconditionExpression_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_targetFinderExpression_26_0=null;
        Token otherlv_27=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:5157:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) (otherlv_7= '?' ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= '{' otherlv_10= 'sourceMappings' otherlv_11= '=' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' otherlv_17= 'targetMappings' otherlv_18= '=' otherlv_19= '[' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ']' otherlv_24= 'targetFinderExpression' otherlv_25= '=' ( (lv_targetFinderExpression_26_0= RULE_EXPRESSION ) ) otherlv_27= '}' ) )
            // InternalSiriusTextDsl.g:5158:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) (otherlv_7= '?' ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= '{' otherlv_10= 'sourceMappings' otherlv_11= '=' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' otherlv_17= 'targetMappings' otherlv_18= '=' otherlv_19= '[' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ']' otherlv_24= 'targetFinderExpression' otherlv_25= '=' ( (lv_targetFinderExpression_26_0= RULE_EXPRESSION ) ) otherlv_27= '}' )
            {
            // InternalSiriusTextDsl.g:5158:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) (otherlv_7= '?' ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= '{' otherlv_10= 'sourceMappings' otherlv_11= '=' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' otherlv_17= 'targetMappings' otherlv_18= '=' otherlv_19= '[' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ']' otherlv_24= 'targetFinderExpression' otherlv_25= '=' ( (lv_targetFinderExpression_26_0= RULE_EXPRESSION ) ) otherlv_27= '}' )
            // InternalSiriusTextDsl.g:5158:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'relationBasedEdge' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )? otherlv_5= 'style' ( ( ruleQualifiedName ) ) (otherlv_7= '?' ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) ) )? otherlv_9= '{' otherlv_10= 'sourceMappings' otherlv_11= '=' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' otherlv_17= 'targetMappings' otherlv_18= '=' otherlv_19= '[' ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_23= ']' otherlv_24= 'targetFinderExpression' otherlv_25= '=' ( (lv_targetFinderExpression_26_0= RULE_EXPRESSION ) ) otherlv_27= '}'
            {
            // InternalSiriusTextDsl.g:5158:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==RULE_DOCUMENTATION) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalSiriusTextDsl.g:5159:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:5159:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:5160:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_117); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getRelationBasedEdgeAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,108,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getRelationBasedEdgeAccess().getRelationBasedEdgeKeyword_1());
                
            // InternalSiriusTextDsl.g:5180:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:5181:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:5181:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:5182:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_118); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRelationBasedEdgeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            // InternalSiriusTextDsl.g:5198:2: (otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==16) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalSiriusTextDsl.g:5198:4: otherlv_3= 'as' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); 

                        	newLeafNode(otherlv_3, grammarAccess.getRelationBasedEdgeAccess().getAsKeyword_3_0());
                        
                    // InternalSiriusTextDsl.g:5202:1: ( (lv_label_4_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:5203:1: (lv_label_4_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:5203:1: (lv_label_4_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:5204:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getRelationBasedEdgeAccess().getLabelSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,83,FOLLOW_4); 

                	newLeafNode(otherlv_5, grammarAccess.getRelationBasedEdgeAccess().getStyleKeyword_4());
                
            // InternalSiriusTextDsl.g:5224:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:5225:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:5225:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:5226:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getStyleEdgeStyleCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_33);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:5239:2: (otherlv_7= '?' ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==37) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalSiriusTextDsl.g:5239:4: otherlv_7= '?' ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_34); 

                        	newLeafNode(otherlv_7, grammarAccess.getRelationBasedEdgeAccess().getQuestionMarkKeyword_6_0());
                        
                    // InternalSiriusTextDsl.g:5243:1: ( (lv_preconditionExpression_8_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:5244:1: (lv_preconditionExpression_8_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:5244:1: (lv_preconditionExpression_8_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:5245:3: lv_preconditionExpression_8_0= RULE_EXPRESSION
                    {
                    lv_preconditionExpression_8_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_11); 

                    			newLeafNode(lv_preconditionExpression_8_0, grammarAccess.getRelationBasedEdgeAccess().getPreconditionExpressionEXPRESSIONTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"preconditionExpression",
                            		lv_preconditionExpression_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_119); 

                	newLeafNode(otherlv_9, grammarAccess.getRelationBasedEdgeAccess().getLeftCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,109,FOLLOW_17); 

                	newLeafNode(otherlv_10, grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsKeyword_8());
                
            otherlv_11=(Token)match(input,23,FOLLOW_18); 

                	newLeafNode(otherlv_11, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_9());
                
            otherlv_12=(Token)match(input,24,FOLLOW_21); 

                	newLeafNode(otherlv_12, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_10());
                
            // InternalSiriusTextDsl.g:5277:1: ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_ID) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalSiriusTextDsl.g:5277:2: ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:5277:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:5278:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:5278:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:5279:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_11_0_0()); 
                    	    
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:5292:2: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                    loop133:
                    do {
                        int alt133=2;
                        int LA133_0 = input.LA(1);

                        if ( (LA133_0==25) ) {
                            alt133=1;
                        }


                        switch (alt133) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:5292:4: otherlv_14= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_14=(Token)match(input,25,FOLLOW_4); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_11_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:5296:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:5297:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:5297:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:5298:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getSourceMappingsMappingCrossReference_11_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_19);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop133;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,26,FOLLOW_120); 

                	newLeafNode(otherlv_16, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_12());
                
            otherlv_17=(Token)match(input,110,FOLLOW_17); 

                	newLeafNode(otherlv_17, grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsKeyword_13());
                
            otherlv_18=(Token)match(input,23,FOLLOW_18); 

                	newLeafNode(otherlv_18, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_14());
                
            otherlv_19=(Token)match(input,24,FOLLOW_21); 

                	newLeafNode(otherlv_19, grammarAccess.getRelationBasedEdgeAccess().getLeftSquareBracketKeyword_15());
                
            // InternalSiriusTextDsl.g:5327:1: ( ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RULE_ID) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalSiriusTextDsl.g:5327:2: ( ( ruleQualifiedName ) ) (otherlv_21= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalSiriusTextDsl.g:5327:2: ( ( ruleQualifiedName ) )
                    // InternalSiriusTextDsl.g:5328:1: ( ruleQualifiedName )
                    {
                    // InternalSiriusTextDsl.g:5328:1: ( ruleQualifiedName )
                    // InternalSiriusTextDsl.g:5329:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_16_0_0()); 
                    	    
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSiriusTextDsl.g:5342:2: (otherlv_21= ',' ( ( ruleQualifiedName ) ) )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==25) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // InternalSiriusTextDsl.g:5342:4: otherlv_21= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_21=(Token)match(input,25,FOLLOW_4); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getRelationBasedEdgeAccess().getCommaKeyword_16_1_0());
                    	        
                    	    // InternalSiriusTextDsl.g:5346:1: ( ( ruleQualifiedName ) )
                    	    // InternalSiriusTextDsl.g:5347:1: ( ruleQualifiedName )
                    	    {
                    	    // InternalSiriusTextDsl.g:5347:1: ( ruleQualifiedName )
                    	    // InternalSiriusTextDsl.g:5348:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRelationBasedEdgeAccess().getTargetMappingsMappingCrossReference_16_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_19);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_23=(Token)match(input,26,FOLLOW_121); 

                	newLeafNode(otherlv_23, grammarAccess.getRelationBasedEdgeAccess().getRightSquareBracketKeyword_17());
                
            otherlv_24=(Token)match(input,111,FOLLOW_17); 

                	newLeafNode(otherlv_24, grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionKeyword_18());
                
            otherlv_25=(Token)match(input,23,FOLLOW_34); 

                	newLeafNode(otherlv_25, grammarAccess.getRelationBasedEdgeAccess().getEqualsSignKeyword_19());
                
            // InternalSiriusTextDsl.g:5373:1: ( (lv_targetFinderExpression_26_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:5374:1: (lv_targetFinderExpression_26_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:5374:1: (lv_targetFinderExpression_26_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:5375:3: lv_targetFinderExpression_26_0= RULE_EXPRESSION
            {
            lv_targetFinderExpression_26_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_23); 

            			newLeafNode(lv_targetFinderExpression_26_0, grammarAccess.getRelationBasedEdgeAccess().getTargetFinderExpressionEXPRESSIONTerminalRuleCall_20_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelationBasedEdgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetFinderExpression",
                    		lv_targetFinderExpression_26_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_27=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_27, grammarAccess.getRelationBasedEdgeAccess().getRightCurlyBracketKeyword_21());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationBasedEdge"


    // $ANTLR start "entryRuleEdgeStyle"
    // InternalSiriusTextDsl.g:5403:1: entryRuleEdgeStyle returns [EObject current=null] : iv_ruleEdgeStyle= ruleEdgeStyle EOF ;
    public final EObject entryRuleEdgeStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeStyle = null;


        try {
            // InternalSiriusTextDsl.g:5404:2: (iv_ruleEdgeStyle= ruleEdgeStyle EOF )
            // InternalSiriusTextDsl.g:5405:2: iv_ruleEdgeStyle= ruleEdgeStyle EOF
            {
             newCompositeNode(grammarAccess.getEdgeStyleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeStyle=ruleEdgeStyle();

            state._fsp--;

             current =iv_ruleEdgeStyle; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeStyle"


    // $ANTLR start "ruleEdgeStyle"
    // InternalSiriusTextDsl.g:5412:1: ruleEdgeStyle returns [EObject current=null] : (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' ( (lv_label_11_0= ruleEdgeLabel ) )? (otherlv_12= 'sourceArrow' otherlv_13= '=' ( (lv_sourceArrow_14_0= ruleArrowDecorator ) ) )? (otherlv_15= 'targetArrow' otherlv_16= '=' ( (lv_targetArrow_17_0= ruleArrowDecorator ) ) )? (otherlv_18= 'sizeComputationExpression' otherlv_19= '=' ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) ) )? (otherlv_21= 'foldingStyle' otherlv_22= '=' ( (lv_foldingStyle_23_0= ruleFoldingStyle ) ) )? (otherlv_24= 'endsCentering' otherlv_25= '=' ( (lv_endsCentering_26_0= ruleEndsCentering ) ) )? otherlv_27= '}' ) ;
    public final EObject ruleEdgeStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_sizeComputationExpression_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Enumerator lv_lineStyle_6_0 = null;

        Enumerator lv_routingStyle_9_0 = null;

        EObject lv_label_11_0 = null;

        Enumerator lv_sourceArrow_14_0 = null;

        Enumerator lv_targetArrow_17_0 = null;

        Enumerator lv_foldingStyle_23_0 = null;

        Enumerator lv_endsCentering_26_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:5415:28: ( (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' ( (lv_label_11_0= ruleEdgeLabel ) )? (otherlv_12= 'sourceArrow' otherlv_13= '=' ( (lv_sourceArrow_14_0= ruleArrowDecorator ) ) )? (otherlv_15= 'targetArrow' otherlv_16= '=' ( (lv_targetArrow_17_0= ruleArrowDecorator ) ) )? (otherlv_18= 'sizeComputationExpression' otherlv_19= '=' ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) ) )? (otherlv_21= 'foldingStyle' otherlv_22= '=' ( (lv_foldingStyle_23_0= ruleFoldingStyle ) ) )? (otherlv_24= 'endsCentering' otherlv_25= '=' ( (lv_endsCentering_26_0= ruleEndsCentering ) ) )? otherlv_27= '}' ) )
            // InternalSiriusTextDsl.g:5416:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' ( (lv_label_11_0= ruleEdgeLabel ) )? (otherlv_12= 'sourceArrow' otherlv_13= '=' ( (lv_sourceArrow_14_0= ruleArrowDecorator ) ) )? (otherlv_15= 'targetArrow' otherlv_16= '=' ( (lv_targetArrow_17_0= ruleArrowDecorator ) ) )? (otherlv_18= 'sizeComputationExpression' otherlv_19= '=' ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) ) )? (otherlv_21= 'foldingStyle' otherlv_22= '=' ( (lv_foldingStyle_23_0= ruleFoldingStyle ) ) )? (otherlv_24= 'endsCentering' otherlv_25= '=' ( (lv_endsCentering_26_0= ruleEndsCentering ) ) )? otherlv_27= '}' )
            {
            // InternalSiriusTextDsl.g:5416:1: (otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' ( (lv_label_11_0= ruleEdgeLabel ) )? (otherlv_12= 'sourceArrow' otherlv_13= '=' ( (lv_sourceArrow_14_0= ruleArrowDecorator ) ) )? (otherlv_15= 'targetArrow' otherlv_16= '=' ( (lv_targetArrow_17_0= ruleArrowDecorator ) ) )? (otherlv_18= 'sizeComputationExpression' otherlv_19= '=' ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) ) )? (otherlv_21= 'foldingStyle' otherlv_22= '=' ( (lv_foldingStyle_23_0= ruleFoldingStyle ) ) )? (otherlv_24= 'endsCentering' otherlv_25= '=' ( (lv_endsCentering_26_0= ruleEndsCentering ) ) )? otherlv_27= '}' )
            // InternalSiriusTextDsl.g:5416:3: otherlv_0= 'edgeStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( ( ruleQualifiedName ) ) (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )? (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )? otherlv_10= '{' ( (lv_label_11_0= ruleEdgeLabel ) )? (otherlv_12= 'sourceArrow' otherlv_13= '=' ( (lv_sourceArrow_14_0= ruleArrowDecorator ) ) )? (otherlv_15= 'targetArrow' otherlv_16= '=' ( (lv_targetArrow_17_0= ruleArrowDecorator ) ) )? (otherlv_18= 'sizeComputationExpression' otherlv_19= '=' ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) ) )? (otherlv_21= 'foldingStyle' otherlv_22= '=' ( (lv_foldingStyle_23_0= ruleFoldingStyle ) ) )? (otherlv_24= 'endsCentering' otherlv_25= '=' ( (lv_endsCentering_26_0= ruleEndsCentering ) ) )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getEdgeStyleAccess().getEdgeStyleKeyword_0());
                
            // InternalSiriusTextDsl.g:5420:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:5421:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:5421:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:5422:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_88); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEdgeStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,90,FOLLOW_4); 

                	newLeafNode(otherlv_2, grammarAccess.getEdgeStyleAccess().getInKeyword_2());
                
            // InternalSiriusTextDsl.g:5442:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:5443:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:5443:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:5444:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeStyleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getStrokeColorColorCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_122);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSiriusTextDsl.g:5457:2: (otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==113) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalSiriusTextDsl.g:5457:4: otherlv_4= 'line' otherlv_5= '=' ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    {
                    otherlv_4=(Token)match(input,113,FOLLOW_17); 

                        	newLeafNode(otherlv_4, grammarAccess.getEdgeStyleAccess().getLineKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,23,FOLLOW_103); 

                        	newLeafNode(otherlv_5, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:5465:1: ( (lv_lineStyle_6_0= ruleLineStyle ) )
                    // InternalSiriusTextDsl.g:5466:1: (lv_lineStyle_6_0= ruleLineStyle )
                    {
                    // InternalSiriusTextDsl.g:5466:1: (lv_lineStyle_6_0= ruleLineStyle )
                    // InternalSiriusTextDsl.g:5467:3: lv_lineStyle_6_0= ruleLineStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLineStyleLineStyleEnumRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_123);
                    lv_lineStyle_6_0=ruleLineStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"lineStyle",
                            		lv_lineStyle_6_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.LineStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5483:4: (otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==114) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalSiriusTextDsl.g:5483:6: otherlv_7= 'routing' otherlv_8= '=' ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    {
                    otherlv_7=(Token)match(input,114,FOLLOW_17); 

                        	newLeafNode(otherlv_7, grammarAccess.getEdgeStyleAccess().getRoutingKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,23,FOLLOW_124); 

                        	newLeafNode(otherlv_8, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_5_1());
                        
                    // InternalSiriusTextDsl.g:5491:1: ( (lv_routingStyle_9_0= ruleRoutingStyle ) )
                    // InternalSiriusTextDsl.g:5492:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    {
                    // InternalSiriusTextDsl.g:5492:1: (lv_routingStyle_9_0= ruleRoutingStyle )
                    // InternalSiriusTextDsl.g:5493:3: lv_routingStyle_9_0= ruleRoutingStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getRoutingStyleRoutingStyleEnumRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_11);
                    lv_routingStyle_9_0=ruleRoutingStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"routingStyle",
                            		lv_routingStyle_9_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.RoutingStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_125); 

                	newLeafNode(otherlv_10, grammarAccess.getEdgeStyleAccess().getLeftCurlyBracketKeyword_6());
                
            // InternalSiriusTextDsl.g:5513:1: ( (lv_label_11_0= ruleEdgeLabel ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==19||LA139_0==96||LA139_0==98) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalSiriusTextDsl.g:5514:1: (lv_label_11_0= ruleEdgeLabel )
                    {
                    // InternalSiriusTextDsl.g:5514:1: (lv_label_11_0= ruleEdgeLabel )
                    // InternalSiriusTextDsl.g:5515:3: lv_label_11_0= ruleEdgeLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getLabelEdgeLabelParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_126);
                    lv_label_11_0=ruleEdgeLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_11_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EdgeLabel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5531:3: (otherlv_12= 'sourceArrow' otherlv_13= '=' ( (lv_sourceArrow_14_0= ruleArrowDecorator ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==115) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalSiriusTextDsl.g:5531:5: otherlv_12= 'sourceArrow' otherlv_13= '=' ( (lv_sourceArrow_14_0= ruleArrowDecorator ) )
                    {
                    otherlv_12=(Token)match(input,115,FOLLOW_17); 

                        	newLeafNode(otherlv_12, grammarAccess.getEdgeStyleAccess().getSourceArrowKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,23,FOLLOW_127); 

                        	newLeafNode(otherlv_13, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_8_1());
                        
                    // InternalSiriusTextDsl.g:5539:1: ( (lv_sourceArrow_14_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:5540:1: (lv_sourceArrow_14_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:5540:1: (lv_sourceArrow_14_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:5541:3: lv_sourceArrow_14_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getSourceArrowArrowDecoratorEnumRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_128);
                    lv_sourceArrow_14_0=ruleArrowDecorator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceArrow",
                            		lv_sourceArrow_14_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ArrowDecorator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5557:4: (otherlv_15= 'targetArrow' otherlv_16= '=' ( (lv_targetArrow_17_0= ruleArrowDecorator ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==116) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalSiriusTextDsl.g:5557:6: otherlv_15= 'targetArrow' otherlv_16= '=' ( (lv_targetArrow_17_0= ruleArrowDecorator ) )
                    {
                    otherlv_15=(Token)match(input,116,FOLLOW_17); 

                        	newLeafNode(otherlv_15, grammarAccess.getEdgeStyleAccess().getTargetArrowKeyword_9_0());
                        
                    otherlv_16=(Token)match(input,23,FOLLOW_127); 

                        	newLeafNode(otherlv_16, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_9_1());
                        
                    // InternalSiriusTextDsl.g:5565:1: ( (lv_targetArrow_17_0= ruleArrowDecorator ) )
                    // InternalSiriusTextDsl.g:5566:1: (lv_targetArrow_17_0= ruleArrowDecorator )
                    {
                    // InternalSiriusTextDsl.g:5566:1: (lv_targetArrow_17_0= ruleArrowDecorator )
                    // InternalSiriusTextDsl.g:5567:3: lv_targetArrow_17_0= ruleArrowDecorator
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getTargetArrowArrowDecoratorEnumRuleCall_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_129);
                    lv_targetArrow_17_0=ruleArrowDecorator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"targetArrow",
                            		lv_targetArrow_17_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.ArrowDecorator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5583:4: (otherlv_18= 'sizeComputationExpression' otherlv_19= '=' ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==94) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalSiriusTextDsl.g:5583:6: otherlv_18= 'sizeComputationExpression' otherlv_19= '=' ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) )
                    {
                    otherlv_18=(Token)match(input,94,FOLLOW_17); 

                        	newLeafNode(otherlv_18, grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionKeyword_10_0());
                        
                    otherlv_19=(Token)match(input,23,FOLLOW_34); 

                        	newLeafNode(otherlv_19, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_10_1());
                        
                    // InternalSiriusTextDsl.g:5591:1: ( (lv_sizeComputationExpression_20_0= RULE_EXPRESSION ) )
                    // InternalSiriusTextDsl.g:5592:1: (lv_sizeComputationExpression_20_0= RULE_EXPRESSION )
                    {
                    // InternalSiriusTextDsl.g:5592:1: (lv_sizeComputationExpression_20_0= RULE_EXPRESSION )
                    // InternalSiriusTextDsl.g:5593:3: lv_sizeComputationExpression_20_0= RULE_EXPRESSION
                    {
                    lv_sizeComputationExpression_20_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_130); 

                    			newLeafNode(lv_sizeComputationExpression_20_0, grammarAccess.getEdgeStyleAccess().getSizeComputationExpressionEXPRESSIONTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEdgeStyleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"sizeComputationExpression",
                            		lv_sizeComputationExpression_20_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5609:4: (otherlv_21= 'foldingStyle' otherlv_22= '=' ( (lv_foldingStyle_23_0= ruleFoldingStyle ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==117) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalSiriusTextDsl.g:5609:6: otherlv_21= 'foldingStyle' otherlv_22= '=' ( (lv_foldingStyle_23_0= ruleFoldingStyle ) )
                    {
                    otherlv_21=(Token)match(input,117,FOLLOW_17); 

                        	newLeafNode(otherlv_21, grammarAccess.getEdgeStyleAccess().getFoldingStyleKeyword_11_0());
                        
                    otherlv_22=(Token)match(input,23,FOLLOW_131); 

                        	newLeafNode(otherlv_22, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_11_1());
                        
                    // InternalSiriusTextDsl.g:5617:1: ( (lv_foldingStyle_23_0= ruleFoldingStyle ) )
                    // InternalSiriusTextDsl.g:5618:1: (lv_foldingStyle_23_0= ruleFoldingStyle )
                    {
                    // InternalSiriusTextDsl.g:5618:1: (lv_foldingStyle_23_0= ruleFoldingStyle )
                    // InternalSiriusTextDsl.g:5619:3: lv_foldingStyle_23_0= ruleFoldingStyle
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getFoldingStyleFoldingStyleEnumRuleCall_11_2_0()); 
                    	    
                    pushFollow(FOLLOW_132);
                    lv_foldingStyle_23_0=ruleFoldingStyle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"foldingStyle",
                            		lv_foldingStyle_23_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.FoldingStyle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5635:4: (otherlv_24= 'endsCentering' otherlv_25= '=' ( (lv_endsCentering_26_0= ruleEndsCentering ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==118) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalSiriusTextDsl.g:5635:6: otherlv_24= 'endsCentering' otherlv_25= '=' ( (lv_endsCentering_26_0= ruleEndsCentering ) )
                    {
                    otherlv_24=(Token)match(input,118,FOLLOW_17); 

                        	newLeafNode(otherlv_24, grammarAccess.getEdgeStyleAccess().getEndsCenteringKeyword_12_0());
                        
                    otherlv_25=(Token)match(input,23,FOLLOW_133); 

                        	newLeafNode(otherlv_25, grammarAccess.getEdgeStyleAccess().getEqualsSignKeyword_12_1());
                        
                    // InternalSiriusTextDsl.g:5643:1: ( (lv_endsCentering_26_0= ruleEndsCentering ) )
                    // InternalSiriusTextDsl.g:5644:1: (lv_endsCentering_26_0= ruleEndsCentering )
                    {
                    // InternalSiriusTextDsl.g:5644:1: (lv_endsCentering_26_0= ruleEndsCentering )
                    // InternalSiriusTextDsl.g:5645:3: lv_endsCentering_26_0= ruleEndsCentering
                    {
                     
                    	        newCompositeNode(grammarAccess.getEdgeStyleAccess().getEndsCenteringEndsCenteringEnumRuleCall_12_2_0()); 
                    	    
                    pushFollow(FOLLOW_23);
                    lv_endsCentering_26_0=ruleEndsCentering();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEdgeStyleRule());
                    	        }
                           		set(
                           			current, 
                           			"endsCentering",
                            		lv_endsCentering_26_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.EndsCentering");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_27, grammarAccess.getEdgeStyleAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeStyle"


    // $ANTLR start "entryRuleEdgeLabel"
    // InternalSiriusTextDsl.g:5673:1: entryRuleEdgeLabel returns [EObject current=null] : iv_ruleEdgeLabel= ruleEdgeLabel EOF ;
    public final EObject entryRuleEdgeLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEdgeLabel = null;


        try {
            // InternalSiriusTextDsl.g:5674:2: (iv_ruleEdgeLabel= ruleEdgeLabel EOF )
            // InternalSiriusTextDsl.g:5675:2: iv_ruleEdgeLabel= ruleEdgeLabel EOF
            {
             newCompositeNode(grammarAccess.getEdgeLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEdgeLabel=ruleEdgeLabel();

            state._fsp--;

             current =iv_ruleEdgeLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEdgeLabel"


    // $ANTLR start "ruleEdgeLabel"
    // InternalSiriusTextDsl.g:5682:1: ruleEdgeLabel returns [EObject current=null] : ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'label' ( (lv_formatOptions_5_0= ruleLabelFormatOption ) )* (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_INT ) ) )? ( (lv_expression_9_0= RULE_EXPRESSION ) ) otherlv_10= 'in' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEdgeLabel() throws RecognitionException {
        EObject current = null;

        Token lv_showIcon_0_0=null;
        Token otherlv_1=null;
        Token lv_iconPath_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_size_8_0=null;
        Token lv_expression_9_0=null;
        Token otherlv_10=null;
        Enumerator lv_formatOptions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:5685:28: ( ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'label' ( (lv_formatOptions_5_0= ruleLabelFormatOption ) )* (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_INT ) ) )? ( (lv_expression_9_0= RULE_EXPRESSION ) ) otherlv_10= 'in' ( ( ruleQualifiedName ) ) ) )
            // InternalSiriusTextDsl.g:5686:1: ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'label' ( (lv_formatOptions_5_0= ruleLabelFormatOption ) )* (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_INT ) ) )? ( (lv_expression_9_0= RULE_EXPRESSION ) ) otherlv_10= 'in' ( ( ruleQualifiedName ) ) )
            {
            // InternalSiriusTextDsl.g:5686:1: ( ( (lv_showIcon_0_0= '@ShowIcon' ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'label' ( (lv_formatOptions_5_0= ruleLabelFormatOption ) )* (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_INT ) ) )? ( (lv_expression_9_0= RULE_EXPRESSION ) ) otherlv_10= 'in' ( ( ruleQualifiedName ) ) )
            // InternalSiriusTextDsl.g:5686:2: ( (lv_showIcon_0_0= '@ShowIcon' ) )? (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )? otherlv_4= 'label' ( (lv_formatOptions_5_0= ruleLabelFormatOption ) )* (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_INT ) ) )? ( (lv_expression_9_0= RULE_EXPRESSION ) ) otherlv_10= 'in' ( ( ruleQualifiedName ) )
            {
            // InternalSiriusTextDsl.g:5686:2: ( (lv_showIcon_0_0= '@ShowIcon' ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==96) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalSiriusTextDsl.g:5687:1: (lv_showIcon_0_0= '@ShowIcon' )
                    {
                    // InternalSiriusTextDsl.g:5687:1: (lv_showIcon_0_0= '@ShowIcon' )
                    // InternalSiriusTextDsl.g:5688:3: lv_showIcon_0_0= '@ShowIcon'
                    {
                    lv_showIcon_0_0=(Token)match(input,96,FOLLOW_99); 

                            newLeafNode(lv_showIcon_0_0, grammarAccess.getEdgeLabelAccess().getShowIconShowIconKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEdgeLabelRule());
                    	        }
                           		setWithLastConsumed(current, "showIcon", true, "@ShowIcon");
                    	    

                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5701:3: (otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==19) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalSiriusTextDsl.g:5701:5: otherlv_1= '@IconPath(' ( (lv_iconPath_2_0= RULE_STRING ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_10); 

                        	newLeafNode(otherlv_1, grammarAccess.getEdgeLabelAccess().getIconPathKeyword_1_0());
                        
                    // InternalSiriusTextDsl.g:5705:1: ( (lv_iconPath_2_0= RULE_STRING ) )
                    // InternalSiriusTextDsl.g:5706:1: (lv_iconPath_2_0= RULE_STRING )
                    {
                    // InternalSiriusTextDsl.g:5706:1: (lv_iconPath_2_0= RULE_STRING )
                    // InternalSiriusTextDsl.g:5707:3: lv_iconPath_2_0= RULE_STRING
                    {
                    lv_iconPath_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    			newLeafNode(lv_iconPath_2_0, grammarAccess.getEdgeLabelAccess().getIconPathSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEdgeLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"iconPath",
                            		lv_iconPath_2_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_100); 

                        	newLeafNode(otherlv_3, grammarAccess.getEdgeLabelAccess().getRightParenthesisKeyword_1_2());
                        

                    }
                    break;

            }

            otherlv_4=(Token)match(input,98,FOLLOW_134); 

                	newLeafNode(otherlv_4, grammarAccess.getEdgeLabelAccess().getLabelKeyword_2());
                
            // InternalSiriusTextDsl.g:5731:1: ( (lv_formatOptions_5_0= ruleLabelFormatOption ) )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( ((LA147_0>=126 && LA147_0<=129)) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:5732:1: (lv_formatOptions_5_0= ruleLabelFormatOption )
            	    {
            	    // InternalSiriusTextDsl.g:5732:1: (lv_formatOptions_5_0= ruleLabelFormatOption )
            	    // InternalSiriusTextDsl.g:5733:3: lv_formatOptions_5_0= ruleLabelFormatOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEdgeLabelAccess().getFormatOptionsLabelFormatOptionEnumRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_134);
            	    lv_formatOptions_5_0=ruleLabelFormatOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEdgeLabelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"formatOptions",
            	            		lv_formatOptions_5_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.LabelFormatOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);

            // InternalSiriusTextDsl.g:5749:3: (otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_INT ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==99) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalSiriusTextDsl.g:5749:5: otherlv_6= 'size' otherlv_7= '=' ( (lv_size_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,99,FOLLOW_17); 

                        	newLeafNode(otherlv_6, grammarAccess.getEdgeLabelAccess().getSizeKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,23,FOLLOW_94); 

                        	newLeafNode(otherlv_7, grammarAccess.getEdgeLabelAccess().getEqualsSignKeyword_4_1());
                        
                    // InternalSiriusTextDsl.g:5757:1: ( (lv_size_8_0= RULE_INT ) )
                    // InternalSiriusTextDsl.g:5758:1: (lv_size_8_0= RULE_INT )
                    {
                    // InternalSiriusTextDsl.g:5758:1: (lv_size_8_0= RULE_INT )
                    // InternalSiriusTextDsl.g:5759:3: lv_size_8_0= RULE_INT
                    {
                    lv_size_8_0=(Token)match(input,RULE_INT,FOLLOW_34); 

                    			newLeafNode(lv_size_8_0, grammarAccess.getEdgeLabelAccess().getSizeINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEdgeLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"size",
                            		lv_size_8_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSiriusTextDsl.g:5775:4: ( (lv_expression_9_0= RULE_EXPRESSION ) )
            // InternalSiriusTextDsl.g:5776:1: (lv_expression_9_0= RULE_EXPRESSION )
            {
            // InternalSiriusTextDsl.g:5776:1: (lv_expression_9_0= RULE_EXPRESSION )
            // InternalSiriusTextDsl.g:5777:3: lv_expression_9_0= RULE_EXPRESSION
            {
            lv_expression_9_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_88); 

            			newLeafNode(lv_expression_9_0, grammarAccess.getEdgeLabelAccess().getExpressionEXPRESSIONTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"expression",
                    		lv_expression_9_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.EXPRESSION");
            	    

            }


            }

            otherlv_10=(Token)match(input,90,FOLLOW_4); 

                	newLeafNode(otherlv_10, grammarAccess.getEdgeLabelAccess().getInKeyword_6());
                
            // InternalSiriusTextDsl.g:5797:1: ( ( ruleQualifiedName ) )
            // InternalSiriusTextDsl.g:5798:1: ( ruleQualifiedName )
            {
            // InternalSiriusTextDsl.g:5798:1: ( ruleQualifiedName )
            // InternalSiriusTextDsl.g:5799:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEdgeLabelRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEdgeLabelAccess().getColorColorCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEdgeLabel"


    // $ANTLR start "entryRulePalette"
    // InternalSiriusTextDsl.g:5820:1: entryRulePalette returns [EObject current=null] : iv_rulePalette= rulePalette EOF ;
    public final EObject entryRulePalette() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePalette = null;


        try {
            // InternalSiriusTextDsl.g:5821:2: (iv_rulePalette= rulePalette EOF )
            // InternalSiriusTextDsl.g:5822:2: iv_rulePalette= rulePalette EOF
            {
             newCompositeNode(grammarAccess.getPaletteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePalette=rulePalette();

            state._fsp--;

             current =iv_rulePalette; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePalette"


    // $ANTLR start "rulePalette"
    // InternalSiriusTextDsl.g:5829:1: rulePalette returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) ;
    public final EObject rulePalette() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_colors_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:5832:28: ( ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' ) )
            // InternalSiriusTextDsl.g:5833:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            {
            // InternalSiriusTextDsl.g:5833:1: ( ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}' )
            // InternalSiriusTextDsl.g:5833:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )? otherlv_1= 'palette' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_colors_4_0= ruleColor ) )* otherlv_5= '}'
            {
            // InternalSiriusTextDsl.g:5833:2: ( (lv_documentation_0_0= RULE_DOCUMENTATION ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==RULE_DOCUMENTATION) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalSiriusTextDsl.g:5834:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    {
                    // InternalSiriusTextDsl.g:5834:1: (lv_documentation_0_0= RULE_DOCUMENTATION )
                    // InternalSiriusTextDsl.g:5835:3: lv_documentation_0_0= RULE_DOCUMENTATION
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_DOCUMENTATION,FOLLOW_135); 

                    			newLeafNode(lv_documentation_0_0, grammarAccess.getPaletteAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPaletteRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_0_0, 
                            		"org.obeonetwork.sirius.text.SiriusTextDsl.DOCUMENTATION");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,119,FOLLOW_4); 

                	newLeafNode(otherlv_1, grammarAccess.getPaletteAccess().getPaletteKeyword_1());
                
            // InternalSiriusTextDsl.g:5855:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:5856:1: (lv_name_2_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:5856:1: (lv_name_2_0= RULE_ID )
            // InternalSiriusTextDsl.g:5857:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPaletteAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPaletteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_136); 

                	newLeafNode(otherlv_3, grammarAccess.getPaletteAccess().getLeftCurlyBracketKeyword_3());
                
            // InternalSiriusTextDsl.g:5877:1: ( (lv_colors_4_0= ruleColor ) )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==120) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // InternalSiriusTextDsl.g:5878:1: (lv_colors_4_0= ruleColor )
            	    {
            	    // InternalSiriusTextDsl.g:5878:1: (lv_colors_4_0= ruleColor )
            	    // InternalSiriusTextDsl.g:5879:3: lv_colors_4_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPaletteAccess().getColorsColorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_136);
            	    lv_colors_4_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPaletteRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"colors",
            	            		lv_colors_4_0, 
            	            		"org.obeonetwork.sirius.text.SiriusTextDsl.Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getPaletteAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePalette"


    // $ANTLR start "entryRuleColor"
    // InternalSiriusTextDsl.g:5907:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalSiriusTextDsl.g:5908:2: (iv_ruleColor= ruleColor EOF )
            // InternalSiriusTextDsl.g:5909:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalSiriusTextDsl.g:5916:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:5919:28: ( (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) ) )
            // InternalSiriusTextDsl.g:5920:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            {
            // InternalSiriusTextDsl.g:5920:1: (otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) ) )
            // InternalSiriusTextDsl.g:5920:3: otherlv_0= 'color' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleColorValue ) )
            {
            otherlv_0=(Token)match(input,120,FOLLOW_4); 

                	newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
                
            // InternalSiriusTextDsl.g:5924:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalSiriusTextDsl.g:5925:1: (lv_name_1_0= RULE_ID )
            {
            // InternalSiriusTextDsl.g:5925:1: (lv_name_1_0= RULE_ID )
            // InternalSiriusTextDsl.g:5926:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_137); 

                	newLeafNode(otherlv_2, grammarAccess.getColorAccess().getEqualsSignKeyword_2());
                
            // InternalSiriusTextDsl.g:5946:1: ( (lv_value_3_0= ruleColorValue ) )
            // InternalSiriusTextDsl.g:5947:1: (lv_value_3_0= ruleColorValue )
            {
            // InternalSiriusTextDsl.g:5947:1: (lv_value_3_0= ruleColorValue )
            // InternalSiriusTextDsl.g:5948:3: lv_value_3_0= ruleColorValue
            {
             
            	        newCompositeNode(grammarAccess.getColorAccess().getValueColorValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleColorValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.ColorValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleColorValue"
    // InternalSiriusTextDsl.g:5972:1: entryRuleColorValue returns [EObject current=null] : iv_ruleColorValue= ruleColorValue EOF ;
    public final EObject entryRuleColorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValue = null;


        try {
            // InternalSiriusTextDsl.g:5973:2: (iv_ruleColorValue= ruleColorValue EOF )
            // InternalSiriusTextDsl.g:5974:2: iv_ruleColorValue= ruleColorValue EOF
            {
             newCompositeNode(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorValue=ruleColorValue();

            state._fsp--;

             current =iv_ruleColorValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalSiriusTextDsl.g:5981:1: ruleColorValue returns [EObject current=null] : this_RGB_0= ruleRGB ;
    public final EObject ruleColorValue() throws RecognitionException {
        EObject current = null;

        EObject this_RGB_0 = null;


         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:5984:28: (this_RGB_0= ruleRGB )
            // InternalSiriusTextDsl.g:5986:5: this_RGB_0= ruleRGB
            {
             
                    newCompositeNode(grammarAccess.getColorValueAccess().getRGBParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_RGB_0=ruleRGB();

            state._fsp--;

             
                    current = this_RGB_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "entryRuleRGB"
    // InternalSiriusTextDsl.g:6002:1: entryRuleRGB returns [EObject current=null] : iv_ruleRGB= ruleRGB EOF ;
    public final EObject entryRuleRGB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGB = null;


        try {
            // InternalSiriusTextDsl.g:6003:2: (iv_ruleRGB= ruleRGB EOF )
            // InternalSiriusTextDsl.g:6004:2: iv_ruleRGB= ruleRGB EOF
            {
             newCompositeNode(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRGB=ruleRGB();

            state._fsp--;

             current =iv_ruleRGB; 
            match(input,EOF,FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalSiriusTextDsl.g:6011:1: ruleRGB returns [EObject current=null] : (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleRGB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_red_2_0=null;
        Token otherlv_3=null;
        Token lv_green_4_0=null;
        Token otherlv_5=null;
        Token lv_blue_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalSiriusTextDsl.g:6014:28: ( (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalSiriusTextDsl.g:6015:1: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalSiriusTextDsl.g:6015:1: (otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalSiriusTextDsl.g:6015:3: otherlv_0= 'rgb' otherlv_1= '(' ( (lv_red_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_green_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_blue_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_51); 

                	newLeafNode(otherlv_0, grammarAccess.getRGBAccess().getRgbKeyword_0());
                
            otherlv_1=(Token)match(input,51,FOLLOW_94); 

                	newLeafNode(otherlv_1, grammarAccess.getRGBAccess().getLeftParenthesisKeyword_1());
                
            // InternalSiriusTextDsl.g:6023:1: ( (lv_red_2_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:6024:1: (lv_red_2_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:6024:1: (lv_red_2_0= RULE_INT )
            // InternalSiriusTextDsl.g:6025:3: lv_red_2_0= RULE_INT
            {
            lv_red_2_0=(Token)match(input,RULE_INT,FOLLOW_62); 

            			newLeafNode(lv_red_2_0, grammarAccess.getRGBAccess().getRedINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"red",
                    		lv_red_2_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_94); 

                	newLeafNode(otherlv_3, grammarAccess.getRGBAccess().getCommaKeyword_3());
                
            // InternalSiriusTextDsl.g:6045:1: ( (lv_green_4_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:6046:1: (lv_green_4_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:6046:1: (lv_green_4_0= RULE_INT )
            // InternalSiriusTextDsl.g:6047:3: lv_green_4_0= RULE_INT
            {
            lv_green_4_0=(Token)match(input,RULE_INT,FOLLOW_62); 

            			newLeafNode(lv_green_4_0, grammarAccess.getRGBAccess().getGreenINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"green",
                    		lv_green_4_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_94); 

                	newLeafNode(otherlv_5, grammarAccess.getRGBAccess().getCommaKeyword_5());
                
            // InternalSiriusTextDsl.g:6067:1: ( (lv_blue_6_0= RULE_INT ) )
            // InternalSiriusTextDsl.g:6068:1: (lv_blue_6_0= RULE_INT )
            {
            // InternalSiriusTextDsl.g:6068:1: (lv_blue_6_0= RULE_INT )
            // InternalSiriusTextDsl.g:6069:3: lv_blue_6_0= RULE_INT
            {
            lv_blue_6_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            			newLeafNode(lv_blue_6_0, grammarAccess.getRGBAccess().getBlueINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRGBRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"blue",
                    		lv_blue_6_0, 
                    		"org.obeonetwork.sirius.text.SiriusTextDsl.INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getRGBAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGB"


    // $ANTLR start "ruleContainerChildrenPresentation"
    // InternalSiriusTextDsl.g:6097:1: ruleContainerChildrenPresentation returns [Enumerator current=null] : ( (enumLiteral_0= 'freeForm' ) | (enumLiteral_1= 'list' ) | (enumLiteral_2= 'horizontalStack' ) | (enumLiteral_3= 'verticalStack' ) ) ;
    public final Enumerator ruleContainerChildrenPresentation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6099:28: ( ( (enumLiteral_0= 'freeForm' ) | (enumLiteral_1= 'list' ) | (enumLiteral_2= 'horizontalStack' ) | (enumLiteral_3= 'verticalStack' ) ) )
            // InternalSiriusTextDsl.g:6100:1: ( (enumLiteral_0= 'freeForm' ) | (enumLiteral_1= 'list' ) | (enumLiteral_2= 'horizontalStack' ) | (enumLiteral_3= 'verticalStack' ) )
            {
            // InternalSiriusTextDsl.g:6100:1: ( (enumLiteral_0= 'freeForm' ) | (enumLiteral_1= 'list' ) | (enumLiteral_2= 'horizontalStack' ) | (enumLiteral_3= 'verticalStack' ) )
            int alt151=4;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt151=1;
                }
                break;
            case 123:
                {
                alt151=2;
                }
                break;
            case 124:
                {
                alt151=3;
                }
                break;
            case 125:
                {
                alt151=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;
            }

            switch (alt151) {
                case 1 :
                    // InternalSiriusTextDsl.g:6100:2: (enumLiteral_0= 'freeForm' )
                    {
                    // InternalSiriusTextDsl.g:6100:2: (enumLiteral_0= 'freeForm' )
                    // InternalSiriusTextDsl.g:6100:4: enumLiteral_0= 'freeForm'
                    {
                    enumLiteral_0=(Token)match(input,122,FOLLOW_2); 

                            current = grammarAccess.getContainerChildrenPresentationAccess().getFreeFormEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContainerChildrenPresentationAccess().getFreeFormEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6106:6: (enumLiteral_1= 'list' )
                    {
                    // InternalSiriusTextDsl.g:6106:6: (enumLiteral_1= 'list' )
                    // InternalSiriusTextDsl.g:6106:8: enumLiteral_1= 'list'
                    {
                    enumLiteral_1=(Token)match(input,123,FOLLOW_2); 

                            current = grammarAccess.getContainerChildrenPresentationAccess().getListEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContainerChildrenPresentationAccess().getListEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6112:6: (enumLiteral_2= 'horizontalStack' )
                    {
                    // InternalSiriusTextDsl.g:6112:6: (enumLiteral_2= 'horizontalStack' )
                    // InternalSiriusTextDsl.g:6112:8: enumLiteral_2= 'horizontalStack'
                    {
                    enumLiteral_2=(Token)match(input,124,FOLLOW_2); 

                            current = grammarAccess.getContainerChildrenPresentationAccess().getHorizontalStackEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContainerChildrenPresentationAccess().getHorizontalStackEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:6118:6: (enumLiteral_3= 'verticalStack' )
                    {
                    // InternalSiriusTextDsl.g:6118:6: (enumLiteral_3= 'verticalStack' )
                    // InternalSiriusTextDsl.g:6118:8: enumLiteral_3= 'verticalStack'
                    {
                    enumLiteral_3=(Token)match(input,125,FOLLOW_2); 

                            current = grammarAccess.getContainerChildrenPresentationAccess().getVerticalStackEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContainerChildrenPresentationAccess().getVerticalStackEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerChildrenPresentation"


    // $ANTLR start "ruleNodeLabelBorderStyle"
    // InternalSiriusTextDsl.g:6128:1: ruleNodeLabelBorderStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'border' ) ) ;
    public final Enumerator ruleNodeLabelBorderStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6130:28: ( ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'border' ) ) )
            // InternalSiriusTextDsl.g:6131:1: ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'border' ) )
            {
            // InternalSiriusTextDsl.g:6131:1: ( (enumLiteral_0= 'node' ) | (enumLiteral_1= 'border' ) )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==82) ) {
                alt152=1;
            }
            else if ( (LA152_0==100) ) {
                alt152=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // InternalSiriusTextDsl.g:6131:2: (enumLiteral_0= 'node' )
                    {
                    // InternalSiriusTextDsl.g:6131:2: (enumLiteral_0= 'node' )
                    // InternalSiriusTextDsl.g:6131:4: enumLiteral_0= 'node'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                            current = grammarAccess.getNodeLabelBorderStyleAccess().getNodeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNodeLabelBorderStyleAccess().getNodeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6137:6: (enumLiteral_1= 'border' )
                    {
                    // InternalSiriusTextDsl.g:6137:6: (enumLiteral_1= 'border' )
                    // InternalSiriusTextDsl.g:6137:8: enumLiteral_1= 'border'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                            current = grammarAccess.getNodeLabelBorderStyleAccess().getBorderEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNodeLabelBorderStyleAccess().getBorderEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeLabelBorderStyle"


    // $ANTLR start "ruleLabelFormatOption"
    // InternalSiriusTextDsl.g:6147:1: ruleLabelFormatOption returns [Enumerator current=null] : ( (enumLiteral_0= 'bold' ) | (enumLiteral_1= 'italic' ) | (enumLiteral_2= 'underline' ) | (enumLiteral_3= 'strikethrought' ) ) ;
    public final Enumerator ruleLabelFormatOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6149:28: ( ( (enumLiteral_0= 'bold' ) | (enumLiteral_1= 'italic' ) | (enumLiteral_2= 'underline' ) | (enumLiteral_3= 'strikethrought' ) ) )
            // InternalSiriusTextDsl.g:6150:1: ( (enumLiteral_0= 'bold' ) | (enumLiteral_1= 'italic' ) | (enumLiteral_2= 'underline' ) | (enumLiteral_3= 'strikethrought' ) )
            {
            // InternalSiriusTextDsl.g:6150:1: ( (enumLiteral_0= 'bold' ) | (enumLiteral_1= 'italic' ) | (enumLiteral_2= 'underline' ) | (enumLiteral_3= 'strikethrought' ) )
            int alt153=4;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt153=1;
                }
                break;
            case 127:
                {
                alt153=2;
                }
                break;
            case 128:
                {
                alt153=3;
                }
                break;
            case 129:
                {
                alt153=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }

            switch (alt153) {
                case 1 :
                    // InternalSiriusTextDsl.g:6150:2: (enumLiteral_0= 'bold' )
                    {
                    // InternalSiriusTextDsl.g:6150:2: (enumLiteral_0= 'bold' )
                    // InternalSiriusTextDsl.g:6150:4: enumLiteral_0= 'bold'
                    {
                    enumLiteral_0=(Token)match(input,126,FOLLOW_2); 

                            current = grammarAccess.getLabelFormatOptionAccess().getBoldEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLabelFormatOptionAccess().getBoldEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6156:6: (enumLiteral_1= 'italic' )
                    {
                    // InternalSiriusTextDsl.g:6156:6: (enumLiteral_1= 'italic' )
                    // InternalSiriusTextDsl.g:6156:8: enumLiteral_1= 'italic'
                    {
                    enumLiteral_1=(Token)match(input,127,FOLLOW_2); 

                            current = grammarAccess.getLabelFormatOptionAccess().getItalicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLabelFormatOptionAccess().getItalicEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6162:6: (enumLiteral_2= 'underline' )
                    {
                    // InternalSiriusTextDsl.g:6162:6: (enumLiteral_2= 'underline' )
                    // InternalSiriusTextDsl.g:6162:8: enumLiteral_2= 'underline'
                    {
                    enumLiteral_2=(Token)match(input,128,FOLLOW_2); 

                            current = grammarAccess.getLabelFormatOptionAccess().getUnderlineEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLabelFormatOptionAccess().getUnderlineEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:6168:6: (enumLiteral_3= 'strikethrought' )
                    {
                    // InternalSiriusTextDsl.g:6168:6: (enumLiteral_3= 'strikethrought' )
                    // InternalSiriusTextDsl.g:6168:8: enumLiteral_3= 'strikethrought'
                    {
                    enumLiteral_3=(Token)match(input,129,FOLLOW_2); 

                            current = grammarAccess.getLabelFormatOptionAccess().getStrikethroughtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLabelFormatOptionAccess().getStrikethroughtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelFormatOption"


    // $ANTLR start "ruleLabelAlignment"
    // InternalSiriusTextDsl.g:6178:1: ruleLabelAlignment returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) ;
    public final Enumerator ruleLabelAlignment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6180:28: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) ) )
            // InternalSiriusTextDsl.g:6181:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            {
            // InternalSiriusTextDsl.g:6181:1: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'center' ) | (enumLiteral_2= 'right' ) )
            int alt154=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt154=1;
                }
                break;
            case 131:
                {
                alt154=2;
                }
                break;
            case 132:
                {
                alt154=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }

            switch (alt154) {
                case 1 :
                    // InternalSiriusTextDsl.g:6181:2: (enumLiteral_0= 'left' )
                    {
                    // InternalSiriusTextDsl.g:6181:2: (enumLiteral_0= 'left' )
                    // InternalSiriusTextDsl.g:6181:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLabelAlignmentAccess().getLeftEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6187:6: (enumLiteral_1= 'center' )
                    {
                    // InternalSiriusTextDsl.g:6187:6: (enumLiteral_1= 'center' )
                    // InternalSiriusTextDsl.g:6187:8: enumLiteral_1= 'center'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLabelAlignmentAccess().getCenterEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6193:6: (enumLiteral_2= 'right' )
                    {
                    // InternalSiriusTextDsl.g:6193:6: (enumLiteral_2= 'right' )
                    // InternalSiriusTextDsl.g:6193:8: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_2); 

                            current = grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLabelAlignmentAccess().getRightEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelAlignment"


    // $ANTLR start "ruleContainerLabelBorderStyle"
    // InternalSiriusTextDsl.g:6203:1: ruleContainerLabelBorderStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'labelBorderStyleWithBeveledCorner' ) | (enumLiteral_1= 'labelBorderForContainer' ) | (enumLiteral_2= 'noLabelBorderForList' ) ) ;
    public final Enumerator ruleContainerLabelBorderStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6205:28: ( ( (enumLiteral_0= 'labelBorderStyleWithBeveledCorner' ) | (enumLiteral_1= 'labelBorderForContainer' ) | (enumLiteral_2= 'noLabelBorderForList' ) ) )
            // InternalSiriusTextDsl.g:6206:1: ( (enumLiteral_0= 'labelBorderStyleWithBeveledCorner' ) | (enumLiteral_1= 'labelBorderForContainer' ) | (enumLiteral_2= 'noLabelBorderForList' ) )
            {
            // InternalSiriusTextDsl.g:6206:1: ( (enumLiteral_0= 'labelBorderStyleWithBeveledCorner' ) | (enumLiteral_1= 'labelBorderForContainer' ) | (enumLiteral_2= 'noLabelBorderForList' ) )
            int alt155=3;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt155=1;
                }
                break;
            case 134:
                {
                alt155=2;
                }
                break;
            case 135:
                {
                alt155=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }

            switch (alt155) {
                case 1 :
                    // InternalSiriusTextDsl.g:6206:2: (enumLiteral_0= 'labelBorderStyleWithBeveledCorner' )
                    {
                    // InternalSiriusTextDsl.g:6206:2: (enumLiteral_0= 'labelBorderStyleWithBeveledCorner' )
                    // InternalSiriusTextDsl.g:6206:4: enumLiteral_0= 'labelBorderStyleWithBeveledCorner'
                    {
                    enumLiteral_0=(Token)match(input,133,FOLLOW_2); 

                            current = grammarAccess.getContainerLabelBorderStyleAccess().getLabelBorderStyleWithBeveledCornerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContainerLabelBorderStyleAccess().getLabelBorderStyleWithBeveledCornerEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6212:6: (enumLiteral_1= 'labelBorderForContainer' )
                    {
                    // InternalSiriusTextDsl.g:6212:6: (enumLiteral_1= 'labelBorderForContainer' )
                    // InternalSiriusTextDsl.g:6212:8: enumLiteral_1= 'labelBorderForContainer'
                    {
                    enumLiteral_1=(Token)match(input,134,FOLLOW_2); 

                            current = grammarAccess.getContainerLabelBorderStyleAccess().getLabelBorderForContainerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContainerLabelBorderStyleAccess().getLabelBorderForContainerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6218:6: (enumLiteral_2= 'noLabelBorderForList' )
                    {
                    // InternalSiriusTextDsl.g:6218:6: (enumLiteral_2= 'noLabelBorderForList' )
                    // InternalSiriusTextDsl.g:6218:8: enumLiteral_2= 'noLabelBorderForList'
                    {
                    enumLiteral_2=(Token)match(input,135,FOLLOW_2); 

                            current = grammarAccess.getContainerLabelBorderStyleAccess().getNoLabelBorderForListEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContainerLabelBorderStyleAccess().getNoLabelBorderForListEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerLabelBorderStyle"


    // $ANTLR start "ruleGradientDirection"
    // InternalSiriusTextDsl.g:6228:1: ruleGradientDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) ;
    public final Enumerator ruleGradientDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6230:28: ( ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) ) )
            // InternalSiriusTextDsl.g:6231:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            {
            // InternalSiriusTextDsl.g:6231:1: ( (enumLiteral_0= 'oblique' ) | (enumLiteral_1= 'lefttoright' ) | (enumLiteral_2= 'toptobottom' ) )
            int alt156=3;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt156=1;
                }
                break;
            case 137:
                {
                alt156=2;
                }
                break;
            case 138:
                {
                alt156=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalSiriusTextDsl.g:6231:2: (enumLiteral_0= 'oblique' )
                    {
                    // InternalSiriusTextDsl.g:6231:2: (enumLiteral_0= 'oblique' )
                    // InternalSiriusTextDsl.g:6231:4: enumLiteral_0= 'oblique'
                    {
                    enumLiteral_0=(Token)match(input,136,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGradientDirectionAccess().getObliqueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6237:6: (enumLiteral_1= 'lefttoright' )
                    {
                    // InternalSiriusTextDsl.g:6237:6: (enumLiteral_1= 'lefttoright' )
                    // InternalSiriusTextDsl.g:6237:8: enumLiteral_1= 'lefttoright'
                    {
                    enumLiteral_1=(Token)match(input,137,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGradientDirectionAccess().getLefttorightEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6243:6: (enumLiteral_2= 'toptobottom' )
                    {
                    // InternalSiriusTextDsl.g:6243:6: (enumLiteral_2= 'toptobottom' )
                    // InternalSiriusTextDsl.g:6243:8: enumLiteral_2= 'toptobottom'
                    {
                    enumLiteral_2=(Token)match(input,138,FOLLOW_2); 

                            current = grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGradientDirectionAccess().getToptobottomEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradientDirection"


    // $ANTLR start "ruleLineStyle"
    // InternalSiriusTextDsl.g:6253:1: ruleLineStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) ;
    public final Enumerator ruleLineStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6255:28: ( ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) ) )
            // InternalSiriusTextDsl.g:6256:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            {
            // InternalSiriusTextDsl.g:6256:1: ( (enumLiteral_0= 'solid' ) | (enumLiteral_1= 'dash' ) | (enumLiteral_2= 'dot' ) | (enumLiteral_3= 'dash_dot' ) )
            int alt157=4;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt157=1;
                }
                break;
            case 140:
                {
                alt157=2;
                }
                break;
            case 141:
                {
                alt157=3;
                }
                break;
            case 142:
                {
                alt157=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // InternalSiriusTextDsl.g:6256:2: (enumLiteral_0= 'solid' )
                    {
                    // InternalSiriusTextDsl.g:6256:2: (enumLiteral_0= 'solid' )
                    // InternalSiriusTextDsl.g:6256:4: enumLiteral_0= 'solid'
                    {
                    enumLiteral_0=(Token)match(input,139,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLineStyleAccess().getSolidEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6262:6: (enumLiteral_1= 'dash' )
                    {
                    // InternalSiriusTextDsl.g:6262:6: (enumLiteral_1= 'dash' )
                    // InternalSiriusTextDsl.g:6262:8: enumLiteral_1= 'dash'
                    {
                    enumLiteral_1=(Token)match(input,140,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLineStyleAccess().getDashEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6268:6: (enumLiteral_2= 'dot' )
                    {
                    // InternalSiriusTextDsl.g:6268:6: (enumLiteral_2= 'dot' )
                    // InternalSiriusTextDsl.g:6268:8: enumLiteral_2= 'dot'
                    {
                    enumLiteral_2=(Token)match(input,141,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLineStyleAccess().getDotEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:6274:6: (enumLiteral_3= 'dash_dot' )
                    {
                    // InternalSiriusTextDsl.g:6274:6: (enumLiteral_3= 'dash_dot' )
                    // InternalSiriusTextDsl.g:6274:8: enumLiteral_3= 'dash_dot'
                    {
                    enumLiteral_3=(Token)match(input,142,FOLLOW_2); 

                            current = grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLineStyleAccess().getDash_dotEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineStyle"


    // $ANTLR start "ruleRoutingStyle"
    // InternalSiriusTextDsl.g:6284:1: ruleRoutingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) ;
    public final Enumerator ruleRoutingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6286:28: ( ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) ) )
            // InternalSiriusTextDsl.g:6287:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            {
            // InternalSiriusTextDsl.g:6287:1: ( (enumLiteral_0= 'straight' ) | (enumLiteral_1= 'manhattan' ) | (enumLiteral_2= 'tree' ) )
            int alt158=3;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt158=1;
                }
                break;
            case 144:
                {
                alt158=2;
                }
                break;
            case 145:
                {
                alt158=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // InternalSiriusTextDsl.g:6287:2: (enumLiteral_0= 'straight' )
                    {
                    // InternalSiriusTextDsl.g:6287:2: (enumLiteral_0= 'straight' )
                    // InternalSiriusTextDsl.g:6287:4: enumLiteral_0= 'straight'
                    {
                    enumLiteral_0=(Token)match(input,143,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRoutingStyleAccess().getStraightEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6293:6: (enumLiteral_1= 'manhattan' )
                    {
                    // InternalSiriusTextDsl.g:6293:6: (enumLiteral_1= 'manhattan' )
                    // InternalSiriusTextDsl.g:6293:8: enumLiteral_1= 'manhattan'
                    {
                    enumLiteral_1=(Token)match(input,144,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRoutingStyleAccess().getManhattanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6299:6: (enumLiteral_2= 'tree' )
                    {
                    // InternalSiriusTextDsl.g:6299:6: (enumLiteral_2= 'tree' )
                    // InternalSiriusTextDsl.g:6299:8: enumLiteral_2= 'tree'
                    {
                    enumLiteral_2=(Token)match(input,145,FOLLOW_2); 

                            current = grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRoutingStyleAccess().getTreeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoutingStyle"


    // $ANTLR start "ruleArrowDecorator"
    // InternalSiriusTextDsl.g:6309:1: ruleArrowDecorator returns [Enumerator current=null] : ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) ;
    public final Enumerator ruleArrowDecorator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6311:28: ( ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) ) )
            // InternalSiriusTextDsl.g:6312:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            {
            // InternalSiriusTextDsl.g:6312:1: ( (enumLiteral_0= 'NoDecoration' ) | (enumLiteral_1= 'OutputArrow' ) | (enumLiteral_2= 'InputArrow' ) | (enumLiteral_3= 'OutputClosedArrow' ) | (enumLiteral_4= 'InputClosedArrow' ) | (enumLiteral_5= 'OutputFillClosedArrow' ) | (enumLiteral_6= 'InputFillClosedArrow' ) | (enumLiteral_7= 'Diamond' ) | (enumLiteral_8= 'FillDiamond' ) | (enumLiteral_9= 'InputArrowWithDiamond' ) | (enumLiteral_10= 'InputArrowWithFillDiamond' ) )
            int alt159=11;
            switch ( input.LA(1) ) {
            case 146:
                {
                alt159=1;
                }
                break;
            case 147:
                {
                alt159=2;
                }
                break;
            case 148:
                {
                alt159=3;
                }
                break;
            case 149:
                {
                alt159=4;
                }
                break;
            case 150:
                {
                alt159=5;
                }
                break;
            case 151:
                {
                alt159=6;
                }
                break;
            case 152:
                {
                alt159=7;
                }
                break;
            case 153:
                {
                alt159=8;
                }
                break;
            case 154:
                {
                alt159=9;
                }
                break;
            case 155:
                {
                alt159=10;
                }
                break;
            case 156:
                {
                alt159=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // InternalSiriusTextDsl.g:6312:2: (enumLiteral_0= 'NoDecoration' )
                    {
                    // InternalSiriusTextDsl.g:6312:2: (enumLiteral_0= 'NoDecoration' )
                    // InternalSiriusTextDsl.g:6312:4: enumLiteral_0= 'NoDecoration'
                    {
                    enumLiteral_0=(Token)match(input,146,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArrowDecoratorAccess().getNoDecorationEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6318:6: (enumLiteral_1= 'OutputArrow' )
                    {
                    // InternalSiriusTextDsl.g:6318:6: (enumLiteral_1= 'OutputArrow' )
                    // InternalSiriusTextDsl.g:6318:8: enumLiteral_1= 'OutputArrow'
                    {
                    enumLiteral_1=(Token)match(input,147,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArrowDecoratorAccess().getOutputArrowEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6324:6: (enumLiteral_2= 'InputArrow' )
                    {
                    // InternalSiriusTextDsl.g:6324:6: (enumLiteral_2= 'InputArrow' )
                    // InternalSiriusTextDsl.g:6324:8: enumLiteral_2= 'InputArrow'
                    {
                    enumLiteral_2=(Token)match(input,148,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArrowDecoratorAccess().getInputArrowEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:6330:6: (enumLiteral_3= 'OutputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:6330:6: (enumLiteral_3= 'OutputClosedArrow' )
                    // InternalSiriusTextDsl.g:6330:8: enumLiteral_3= 'OutputClosedArrow'
                    {
                    enumLiteral_3=(Token)match(input,149,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getArrowDecoratorAccess().getOutputClosedArrowEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // InternalSiriusTextDsl.g:6336:6: (enumLiteral_4= 'InputClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:6336:6: (enumLiteral_4= 'InputClosedArrow' )
                    // InternalSiriusTextDsl.g:6336:8: enumLiteral_4= 'InputClosedArrow'
                    {
                    enumLiteral_4=(Token)match(input,150,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getArrowDecoratorAccess().getInputClosedArrowEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // InternalSiriusTextDsl.g:6342:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:6342:6: (enumLiteral_5= 'OutputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:6342:8: enumLiteral_5= 'OutputFillClosedArrow'
                    {
                    enumLiteral_5=(Token)match(input,151,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getArrowDecoratorAccess().getOutputFillClosedArrowEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // InternalSiriusTextDsl.g:6348:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    {
                    // InternalSiriusTextDsl.g:6348:6: (enumLiteral_6= 'InputFillClosedArrow' )
                    // InternalSiriusTextDsl.g:6348:8: enumLiteral_6= 'InputFillClosedArrow'
                    {
                    enumLiteral_6=(Token)match(input,152,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getArrowDecoratorAccess().getInputFillClosedArrowEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // InternalSiriusTextDsl.g:6354:6: (enumLiteral_7= 'Diamond' )
                    {
                    // InternalSiriusTextDsl.g:6354:6: (enumLiteral_7= 'Diamond' )
                    // InternalSiriusTextDsl.g:6354:8: enumLiteral_7= 'Diamond'
                    {
                    enumLiteral_7=(Token)match(input,153,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getArrowDecoratorAccess().getDiamondEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // InternalSiriusTextDsl.g:6360:6: (enumLiteral_8= 'FillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:6360:6: (enumLiteral_8= 'FillDiamond' )
                    // InternalSiriusTextDsl.g:6360:8: enumLiteral_8= 'FillDiamond'
                    {
                    enumLiteral_8=(Token)match(input,154,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getArrowDecoratorAccess().getFillDiamondEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // InternalSiriusTextDsl.g:6366:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    {
                    // InternalSiriusTextDsl.g:6366:6: (enumLiteral_9= 'InputArrowWithDiamond' )
                    // InternalSiriusTextDsl.g:6366:8: enumLiteral_9= 'InputArrowWithDiamond'
                    {
                    enumLiteral_9=(Token)match(input,155,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getArrowDecoratorAccess().getInputArrowWithDiamondEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // InternalSiriusTextDsl.g:6372:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    {
                    // InternalSiriusTextDsl.g:6372:6: (enumLiteral_10= 'InputArrowWithFillDiamond' )
                    // InternalSiriusTextDsl.g:6372:8: enumLiteral_10= 'InputArrowWithFillDiamond'
                    {
                    enumLiteral_10=(Token)match(input,156,FOLLOW_2); 

                            current = grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getArrowDecoratorAccess().getInputArrowWithFillDiamondEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrowDecorator"


    // $ANTLR start "ruleFoldingStyle"
    // InternalSiriusTextDsl.g:6382:1: ruleFoldingStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) ;
    public final Enumerator ruleFoldingStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6384:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) ) )
            // InternalSiriusTextDsl.g:6385:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            {
            // InternalSiriusTextDsl.g:6385:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'source' ) | (enumLiteral_2= 'target' ) )
            int alt160=3;
            switch ( input.LA(1) ) {
            case 157:
                {
                alt160=1;
                }
                break;
            case 158:
                {
                alt160=2;
                }
                break;
            case 159:
                {
                alt160=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }

            switch (alt160) {
                case 1 :
                    // InternalSiriusTextDsl.g:6385:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:6385:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:6385:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,157,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFoldingStyleAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6391:6: (enumLiteral_1= 'source' )
                    {
                    // InternalSiriusTextDsl.g:6391:6: (enumLiteral_1= 'source' )
                    // InternalSiriusTextDsl.g:6391:8: enumLiteral_1= 'source'
                    {
                    enumLiteral_1=(Token)match(input,158,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFoldingStyleAccess().getSourceEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6397:6: (enumLiteral_2= 'target' )
                    {
                    // InternalSiriusTextDsl.g:6397:6: (enumLiteral_2= 'target' )
                    // InternalSiriusTextDsl.g:6397:8: enumLiteral_2= 'target'
                    {
                    enumLiteral_2=(Token)match(input,159,FOLLOW_2); 

                            current = grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFoldingStyleAccess().getTargetEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFoldingStyle"


    // $ANTLR start "ruleEndsCentering"
    // InternalSiriusTextDsl.g:6407:1: ruleEndsCentering returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) ;
    public final Enumerator ruleEndsCentering() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalSiriusTextDsl.g:6409:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) ) )
            // InternalSiriusTextDsl.g:6410:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            {
            // InternalSiriusTextDsl.g:6410:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'both' ) | (enumLiteral_2= 'source' ) | (enumLiteral_3= 'target' ) )
            int alt161=4;
            switch ( input.LA(1) ) {
            case 157:
                {
                alt161=1;
                }
                break;
            case 160:
                {
                alt161=2;
                }
                break;
            case 158:
                {
                alt161=3;
                }
                break;
            case 159:
                {
                alt161=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }

            switch (alt161) {
                case 1 :
                    // InternalSiriusTextDsl.g:6410:2: (enumLiteral_0= 'none' )
                    {
                    // InternalSiriusTextDsl.g:6410:2: (enumLiteral_0= 'none' )
                    // InternalSiriusTextDsl.g:6410:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,157,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getEndsCenteringAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSiriusTextDsl.g:6416:6: (enumLiteral_1= 'both' )
                    {
                    // InternalSiriusTextDsl.g:6416:6: (enumLiteral_1= 'both' )
                    // InternalSiriusTextDsl.g:6416:8: enumLiteral_1= 'both'
                    {
                    enumLiteral_1=(Token)match(input,160,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getEndsCenteringAccess().getBothEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // InternalSiriusTextDsl.g:6422:6: (enumLiteral_2= 'source' )
                    {
                    // InternalSiriusTextDsl.g:6422:6: (enumLiteral_2= 'source' )
                    // InternalSiriusTextDsl.g:6422:8: enumLiteral_2= 'source'
                    {
                    enumLiteral_2=(Token)match(input,158,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getEndsCenteringAccess().getSourceEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // InternalSiriusTextDsl.g:6428:6: (enumLiteral_3= 'target' )
                    {
                    // InternalSiriusTextDsl.g:6428:6: (enumLiteral_3= 'target' )
                    // InternalSiriusTextDsl.g:6428:8: enumLiteral_3= 'target'
                    {
                    enumLiteral_3=(Token)match(input,159,FOLLOW_2); 

                            current = grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getEndsCenteringAccess().getTargetEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndsCentering"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\1\17\2\uffff\1\6\7\uffff\1\24\1\53";
    static final String dfa_3s = "\2\167\2\uffff\1\6\7\uffff\1\24\1\62";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\2\3\uffff\1\4\11\uffff\4\3\2\uffff\1\3\7\uffff\1\5\3\uffff\1\12\1\uffff\2\13\37\uffff\1\6\3\uffff\1\6\3\7\13\uffff\1\7\6\uffff\1\11\3\uffff\1\7\6\uffff\1\10",
            "\1\2\3\uffff\1\4\11\uffff\4\3\2\uffff\1\3\7\uffff\1\5\3\uffff\1\12\1\uffff\2\13\37\uffff\1\6\3\uffff\1\6\3\7\13\uffff\1\7\6\uffff\1\11\12\uffff\1\10",
            "",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\5\3\uffff\1\12\2\uffff\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "178:1: (this_Designer_0= ruleDesigner | this_Representation_1= ruleRepresentation | this_Layer_2= ruleLayer | this_Mapping_3= ruleMapping | this_Style_4= ruleStyle | this_Palette_5= rulePalette | this_Edge_6= ruleEdge | this_Section_7= ruleSection | this_Tool_8= ruleTool )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00068809E008C010L,0x0081102003C40000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000002C0010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018440000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000009E0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000009C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000980000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000007C000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000078000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000070000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000060000040000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000700000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000600000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000080000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0006000000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000002000030000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x9A00001000040000L,0x000000000000B492L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000040000L,0x0000000000030000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000040000L,0x0000000000380000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000040000L,0x0000000000280000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000020L,0x3C00000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x00000000000C0000L,0x00000017F8000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000040000L,0x00000010F8000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000001000040000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000040000L,0x00000010F0000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000040000L,0x00000000F0000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000040000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000040000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000040000L,0x0000000080000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000080000L,0x0000000600000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000080000L,0x0000000400000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000080L,0xC000000800000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000080L,0x0000000800000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000700L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x00000000000C0000L,0x00000F1788000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000040000L,0x00000F1088000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000040000L,0x00000F1080000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000040000L,0x00000F0080000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000040000L,0x00000E0080000000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000040000L,0x00000C0080000000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000040000L,0x0000080080000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000010000L,0x0000000000080000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000020000L,0x0006000000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000020000L,0x0004000000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x00000000000C0000L,0x0078000540000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000040000L,0x0078000040000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000001FFC0000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000040000L,0x0070000040000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000040000L,0x0060000040000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000040000L,0x0060000000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000040000L,0x0040000000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000080L,0xC000000800000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000040000L,0x0100000000000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});

}